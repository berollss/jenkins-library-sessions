def call(Map config) { // necesario que sea así para que jenkins pueda llamar a auditTools 
    node { // scripted pipelines, para poder ponerlo como un step en una pipeline
        echo %{config.message}
        sh '''
            git version
            docker version
            dotnet --list-sdks
            dotnet --list-runtimes
        '''
    }
}