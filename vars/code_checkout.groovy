def call(string GitUrl,string GitBranch){
git branch: "${GitBranch}", url: "${GitUrl}"
  echo 'code pull successfully'
}
