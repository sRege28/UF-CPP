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
args = parser.parse_args()

if __name__ == '__main__':
    problem_name = args.problem_name
    problem_id = args.problem_id
    problem_tags = args.problem_tags
    os.makedirs(problem_name)
    readme_file_path = os.path.join(problem_name, 'README.md')
    shutil.copy('q_template.md', readme_file_path)

    # edit content
    with open(readme_file_path, 'r') as file:
        data = file.readlines()

    # edit File Title to problem name
    if problem_tags is not None:
        data[3] = 'Tags:'
        for tag in problem_tags:
            data[3] += ' __' + tag + '__,'

        data[3] = data[3][:-1]

    if problem_id is not None:
        data[2] = '# ' + problem_id + '. ' + problem_name + '\n'
        data[10] = data[10].replace('qxxx', ('' + problem_id).zfill(3))
        del data[9]
        del data[8]
    else:
        data[2] = '# ' + problem_name + '\n'

    # and write everything back
    with open(readme_file_path, 'w') as file:
        file.writelines(data)
