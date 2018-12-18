#import <Cordova/CDVPlugin.h>
#import <Cordova/CDVInvokedUrlCommand.h>

@interface SplurgeIpc : CDVPlugin

#define SYSTEM_VERSION_LESS_THAN(v)                 ([[[UIDevice currentDevice] systemVersion] compare:v options:NSNumericSearch] == NSOrderedAscending)

- (void)send:(CDVInvokedUrlCommand*)command;
@end
