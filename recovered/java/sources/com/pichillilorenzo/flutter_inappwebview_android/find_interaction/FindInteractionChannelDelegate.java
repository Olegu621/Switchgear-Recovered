            package com.pichillilorenzo.flutter_inappwebview_android.find_interaction;

            import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
            import com.pichillilorenzo.flutter_inappwebview_android.types.FindSession;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import java.util.HashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class FindInteractionChannelDelegate extends ChannelDelegateImpl {
                private FindInteractionController findInteractionController;

                public FindInteractionChannelDelegate(FindInteractionController findInteractionController, MethodChannel methodChannel) {
/* 1 */             super(methodChannel);
/* 4 */             this.findInteractionController = findInteractionController;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                public void dispose() {
/* 1 */             super.dispose();
/* 5 */             this.findInteractionController = null;
                }

                public void onFindResultReceived(int i, int i2, boolean z) {
                    FindInteractionController findInteractionController;
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 8 */             if (z && (findInteractionController = this.findInteractionController) != null && findInteractionController.webView != null) {
/* 23 */                findInteractionController.activeFindSession = new FindSession(i2, i);
                    }
/* 27 */            HashMap map = new HashMap();
/* 36 */            map.put("activeMatchOrdinal", Integer.valueOf(i));
/* 45 */            map.put("numberOfMatches", Integer.valueOf(i2));
/* 54 */            map.put("isDoneCounting", Boolean.valueOf(z));
/* 59 */            channel.invokeMethod("onFindResultReceived", map);
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
                public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                    FindSession findSession;
/* 1 */             String str = methodCall.method;
/* 3 */             str.getClass();
                    switch (str) {
                        case "getSearchText":
/* 197 */                   FindInteractionController findInteractionController = this.findInteractionController;
/* 199 */                   if (findInteractionController == null) {
/* 209 */                       result.success(Boolean.FALSE);
                                break;
                            } else {
/* 203 */                       result.success(findInteractionController.searchText);
                                break;
                            }
                            break;
                        case "findAll":
/* 176 */                   if (this.findInteractionController != null) {
/* 188 */                       this.findInteractionController.findAll((String) methodCall.argument("find"));
                            }
/* 193 */                   result.success(Boolean.TRUE);
                            break;
                        case "findNext":
/* 149 */                   if (this.findInteractionController != null) {
/* 165 */                       this.findInteractionController.findNext(((Boolean) methodCall.argument("forward")).booleanValue());
                            }
/* 170 */                   result.success(Boolean.TRUE);
                            break;
                        case "setSearchText":
/* 121 */                   FindInteractionController findInteractionController2 = this.findInteractionController;
/* 123 */                   if (findInteractionController2 == null) {
/* 143 */                       result.success(Boolean.FALSE);
                                break;
                            } else {
/* 133 */                       findInteractionController2.searchText = (String) methodCall.argument("searchText");
/* 137 */                       result.success(Boolean.TRUE);
                                break;
                            }
                            break;
                        case "clearMatches":
/* 108 */                   FindInteractionController findInteractionController3 = this.findInteractionController;
/* 110 */                   if (findInteractionController3 != null) {
/* 112 */                       findInteractionController3.clearMatches();
                            }
/* 117 */                   result.success(Boolean.TRUE);
                            break;
                        case "getActiveFindSession":
/* 87 */                    FindInteractionController findInteractionController4 = this.findInteractionController;
/* 89 */                    if (findInteractionController4 != null && (findSession = findInteractionController4.activeFindSession) != null) {
/* 99 */                        result.success(findSession.toMap());
                                break;
                            } else {
/* 104 */                       result.success(null);
                                break;
                            }
                            break;
                        default:
/* 83 */                    result.notImplemented();
                            break;
                    }
                }
            }
