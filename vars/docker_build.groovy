def call(String dockerHubUser,String ImgName){
  sh "docker build -t ${dockerHubUser}/${ImgName} ."
  echo "Build Image Successfully"
}
