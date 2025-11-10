def call(String dockerHubUser,String dockerHubPass, String imgName){
    sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
    sh "docker push ${imgName}:latest"
    echo "image push successfully"   
}
