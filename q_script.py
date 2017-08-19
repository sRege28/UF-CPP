import argparse as ap
import os
import shutil

parser = ap.ArgumentParser(description='Auto grader script.')
parser.add_argument('-n', '--name', required=True, dest='problem_name', default=[],
                    help="the name of question")
parser.add_argument('-i', '--id', dest='problem_id',
                    help="the id number of question on leetcode")
parser.add_argument('-t', '--tag', dest='problem_tags', nargs='+',
                    help="the tags for the problem")
parser.add_argument('-c', '--company', dest='problem_company', nargs='+',
                    help="the company names who use this question")
parser.add_argument('-l', '--link', dest='problem_link',
                    help="the question link(on leetcode)")

args = parser.parse_args()

if __name__ == '__main__':
    problem_name = args.problem_name
    problem_id = args.problem_id
    problem_tags = args.problem_tags
    problem_companies = args.problem_company
    problem_link = args.problem_link
    os.makedirs(problem_name)
    readme_file_path = os.path.join(problem_name, 'README.md')
    shutil.copy('q_template.md', readme_file_path)

    # edit content
    with open(readme_file_path, 'r') as file:
        data = file.readlines()

    line_num = 0
    for line in list(data):  # create new list in case delete on iterating
        if line.lower().startswith('tags:'):  # this line contains all tags
            if problem_tags is not None: # add all tags
                line = 'Tags:'
                for tag in problem_tags:
                    line += ' __' + tag + '__,'
            if problem_companies is not None: # add company tags
                for company in problem_companies:
                    line += ' __' + company + '__,'

            data[line_num] = line[:-1]

        if line.lower().startswith('# brief intro'):
            if problem_id is not None:
                # edit File Title to problem name
                data[line_num] = '# ' + problem_id + '. ' + problem_name + '\n'
            else:
                data[2] = '# ' + problem_name + '\n'

        if 'leetcode qxxx' in line:
            if problem_link is not None:
                line = line.replace('https://www.google.com', problem_link)
            if problem_id is not None:
                line = line.replace('qxxx', ('' + problem_id).zfill(3))

            data[line_num] = line
            del data[line_num - 1] # delete the 'from CCI page xxx' line, all following lines will reduce number by 1

        line_num += 1

    # and write everything back
    with open(readme_file_path, 'w') as file:
        file.writelines(data)
