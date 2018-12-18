#import "SplurgeIpc.h"

@implementation SplurgeIpc

- (BOOL)do_open:(NSString *)pref {
	if ([[UIApplication sharedApplication] openURL:[NSURL URLWithString:pref]]) {
		return YES;
	} else {
		return NO;
	}
}

- (void)send:(CDVInvokedUrlCommand*)command
{
	
	[self.commandDelegate sendPluginResult:pluginResult callbackId:command.callbackId];
}

@end
