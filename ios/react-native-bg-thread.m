//
//  react-native-bg-thread.m
//  react-native-bg-thread
//
//  Created by Alex on 25/10/2019.
//  Copyright © 2019 Facebook. All rights reserved.
//

#import "react-native-bg-thread.h"
@implementation RnBgTask
RCT_EXPORT_MODULE(RnBgTask);
RCT_EXPORT_METHO
D(runInBackground:(RCTResponseSenderBlock)callback){
  NSOperationQueue *q = [[NSOperationQueue alloc] init];
  [q addOperationWithBlock: ^{
    callback(@[]);
  }];
}
@end
  