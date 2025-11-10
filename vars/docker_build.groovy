def call(String dockerHubUser,String ImgName){
  sh "docker build -t ${ImgName}/${ImgName} ."
  echo "Build Image Successfully"
}
