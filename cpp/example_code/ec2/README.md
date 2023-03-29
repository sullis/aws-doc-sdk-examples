<!--Generated by WRITEME on 2023-03-02 21:35:25.256793 (UTC)-->
# Amazon EC2 code examples for the SDK for C++

## Overview

Shows how to use the AWS SDK for C++ to work with Amazon Elastic Compute Cloud (Amazon EC2).

<!--custom.overview.start-->
<!--custom.overview.end-->

*Amazon EC2 is a web service that provides resizable computing capacity—literally, servers in Amazon's data centers—that you use to build and host your software systems.*

## ⚠ Important

* Running this code might result in charges to your AWS account.
* Running the tests might result in charges to your AWS account.
* We recommend that you grant your code least privilege. At most, grant only the minimum permissions required to perform the task. For more information, see [Grant least privilege](https://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html#grant-least-privilege).
* This code is not tested in every AWS Region. For more information, see [AWS Regional Services](https://aws.amazon.com/about-aws/global-infrastructure/regional-product-services).

<!--custom.important.start-->
<!--custom.important.end-->

## Code examples

### Single actions

Code excerpts that show you how to call individual service functions.

* [Add tags to resources](create_instance.cpp#L74) (`CreateTags`)
* [Allocate an Elastic IP address](allocate_address.cpp#L45) (`AllocateAddress`)
* [Associate an Elastic IP address with an instance](allocate_address.cpp#L60) (`AssociateAddress`)
* [Create a security group](create_security_group.cpp#L61) (`CreateSecurityGroup`)
* [Create a security key pair](create_key_pair.cpp#L35) (`CreateKeyPair`)
* [Create and run an instance](create_instance.cpp#L46) (`RunInstances`)
* [Delete a security group](delete_security_group.cpp#L34) (`DeleteSecurityGroup`)
* [Delete a security key pair](delete_key_pair.cpp#L35) (`DeleteKeyPair`)
* [Describe Availability Zones](describe_regions_and_zones.cpp#L70) (`DescribeAvailabilityZones`)
* [Describe Regions](describe_regions_and_zones.cpp#L44) (`DescribeRegions`)
* [Describe instances](describe_instances.cpp#L35) (`DescribeInstances`)
* [Disable detailed monitoring](monitor_instance.cpp#L84) (`UnmonitorInstances`)
* [Enable monitoring](monitor_instance.cpp#L37) (`MonitorInstances`)
* [Get data about a security group](describe_security_groups.cpp#L36) (`DescribeSecurityGroups`)
* [Get details about Elastic IP addresses](describe_addresses.cpp#L35) (`DescribeAddresses`)
* [List security key pairs](describe_key_pairs.cpp#L35) (`DescribeKeyPairs`)
* [Reboot an instance](reboot_instance.cpp#L35) (`RebootInstances`)
* [Release an Elastic IP address](release_address.cpp#L33) (`ReleaseAddress`)
* [Set inbound rules for a security group](allocate_address.cpp#L41) (`AuthorizeSecurityGroupIngress`)
* [Start an instance](start_stop_instance.cpp#L40) (`StartInstances`)
* [Stop an instance](start_stop_instance.cpp#86) (`StopInstances`)
* [Terminate an instance](terminate_instances.cpp#L32) (`TerminateInstances`)

## Run the examples

### Prerequisites

Before using the code examples, first complete the installation and setup steps
for [Getting started](https://docs.aws.amazon.com/sdk-for-cpp/v1/developer-guide/getting-started.html) in the AWS SDK for
C++ Developer Guide.
This section covers how to get and build the SDK, and how to build your own code by using the SDK with a
sample Hello World-style application.

Next, for information on code example structures and how to build and run the examples, see [Getting started with the AWS SDK for C++ code examples](https://docs.aws.amazon.com/sdk-for-cpp/v1/developer-guide/getting-started-code-examples.html).


<!--custom.prerequisites.start-->
<!--custom.prerequisites.end-->

### Instructions


<!--custom.instructions.start-->
<!--custom.instructions.end-->


### Tests

⚠ Running tests might result in charges to your AWS account.



```sh
   cd <BUILD_DIR>
   cmake <path-to-root-of-this-source-code> -DBUILD_TESTS=ON
   make
   ctest
```


<!--custom.tests.start-->
<!--custom.tests.end-->

## Additional resources

* [Amazon EC2 User Guide](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/concepts.html)
* [Amazon EC2 API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/Welcome.html)
* [SDK for C++ Amazon EC2 reference](https://sdk.amazonaws.com/cpp/api/LATEST/aws-cpp-sdk-ec2/html/annotated.html)

<!--custom.resources.start-->
<!--custom.resources.end-->

---

Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.

SPDX-License-Identifier: Apache-2.0