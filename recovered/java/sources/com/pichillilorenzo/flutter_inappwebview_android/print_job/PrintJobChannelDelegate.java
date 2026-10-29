            package com.pichillilorenzo.flutter_inappwebview_android.print_job;

            import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
            import com.pichillilorenzo.flutter_inappwebview_android.types.PrintJobInfoExt;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class PrintJobChannelDelegate extends ChannelDelegateImpl {
                private PrintJobController printJobController;

                public PrintJobChannelDelegate(PrintJobController printJobController, MethodChannel methodChannel) {
/* 1 */             super(methodChannel);
/* 4 */             this.printJobController = printJobController;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                public void dispose() {
/* 1 */             super.dispose();
/* 5 */             this.printJobController = null;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
                public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
/* 1 */             String str = methodCall.method;
/* 3 */             str.getClass();
                    switch (str) {
                        case "cancel":
/* 126 */                   PrintJobController printJobController = this.printJobController;
/* 128 */                   if (printJobController == null) {
/* 141 */                       result.success(Boolean.FALSE);
                                break;
                            } else {
/* 130 */                       printJobController.cancel();
/* 135 */                       result.success(Boolean.TRUE);
                                break;
                            }
                            break;
                        case "getInfo":
/* 103 */                   PrintJobController printJobController2 = this.printJobController;
/* 106 */                   if (printJobController2 == null) {
/* 122 */                       result.success(null);
                                break;
                            } else {
/* 108 */                       PrintJobInfoExt info = printJobController2.getInfo();
/* 118 */                       result.success(info != null ? info.toMap() : null);
                                break;
                            }
                            break;
                        case "restart":
/* 84 */                    PrintJobController printJobController3 = this.printJobController;
/* 86 */                    if (printJobController3 == null) {
/* 99 */                        result.success(Boolean.FALSE);
                                break;
                            } else {
/* 88 */                        printJobController3.restart();
/* 93 */                        result.success(Boolean.TRUE);
                                break;
                            }
                            break;
                        case "dispose":
/* 65 */                    PrintJobController printJobController4 = this.printJobController;
/* 67 */                    if (printJobController4 == null) {
/* 80 */                        result.success(Boolean.FALSE);
                                break;
                            } else {
/* 69 */                        printJobController4.dispose();
/* 74 */                        result.success(Boolean.TRUE);
                                break;
                            }
                            break;
                        default:
/* 61 */                    result.notImplemented();
                            break;
                    }
                }
            }
