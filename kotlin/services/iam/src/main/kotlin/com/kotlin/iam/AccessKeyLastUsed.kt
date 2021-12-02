//snippet-sourcedescription:[AccessKeyLastUsed.kt demonstrates how to display the time that an access key was last used.]
//snippet-keyword:[AWS SDK for Kotlin]
//snippet-keyword:[Code Sample]
//snippet-service:[Identity and Access Management (IAM)]
//snippet-sourcetype:[full-example]
//snippet-sourcedate:[11/04/2021]
//snippet-sourceauthor:[scmacdon-aws]

/*
   Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
   SPDX-License-Identifier: Apache-2.0
*/

package com.kotlin.iam

// snippet-start:[iam.kotlin.access_key_last_used.import]
import aws.sdk.kotlin.services.iam.IamClient
import aws.sdk.kotlin.services.iam.model.GetAccessKeyLastUsedRequest
import kotlin.system.exitProcess
// snippet-end:[iam.kotlin.access_key_last_used.import]

/**
To run this Kotlin code example, ensure that you have setup your development environment,
including your credentials.

For information, see this documentation topic:
https://docs.aws.amazon.com/sdk-for-kotlin/latest/developer-guide/setup.html
 */

suspend fun main(args: Array<String>) {

    val usage = """
        Usage:
            <accessId> 
        Where:
            accessId - an access key id that you can obtain from the AWS Management Console. 
        """

    if (args.size != 1) {
         println(usage)
         exitProcess(0)
    }

    val accessId = args[0]
    getAccessKeyLastUsed(accessId)

}

// snippet-start:[iam.kotlin.access_key_last_used.main]
suspend fun getAccessKeyLastUsed(accessId: String?) {

    val request = GetAccessKeyLastUsedRequest {
        accessKeyId = accessId
    }

    IamClient { region = "AWS_GLOBAL" }.use { iamClient ->
          val response = iamClient.getAccessKeyLastUsed(request)
          println( "Access key was last used on ${response.accessKeyLastUsed?.lastUsedDate}")
    }
}
// snippet-end:[iam.kotlin.access_key_last_used.main]