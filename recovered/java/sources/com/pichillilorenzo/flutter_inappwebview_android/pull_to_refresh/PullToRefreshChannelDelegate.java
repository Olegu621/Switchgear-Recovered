            package com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh;

            import android.graphics.Color;
            import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import java.util.HashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class PullToRefreshChannelDelegate extends ChannelDelegateImpl {
                private PullToRefreshLayout pullToRefreshView;

                public PullToRefreshChannelDelegate(PullToRefreshLayout pullToRefreshLayout, MethodChannel methodChannel) {
/* 1 */             super(methodChannel);
/* 4 */             this.pullToRefreshView = pullToRefreshLayout;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
                public void dispose() {
/* 1 */             super.dispose();
/* 5 */             this.pullToRefreshView = null;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
                public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
/* 1 */             String str = methodCall.method;
/* 3 */             str.getClass();
                    switch (str) {
                        case "setSlingshotDistance":
/* 395 */                   if (this.pullToRefreshView == null) {
/* 422 */                       result.success(Boolean.FALSE);
                                break;
                            } else {
/* 411 */                       this.pullToRefreshView.setSlingshotDistance(((Integer) methodCall.argument("slingshotDistance")).intValue());
/* 416 */                       result.success(Boolean.TRUE);
                                break;
                            }
                            break;
                        case "setRefreshing":
/* 362 */                   if (this.pullToRefreshView == null) {
/* 389 */                       result.success(Boolean.FALSE);
                                break;
                            } else {
/* 378 */                       this.pullToRefreshView.setRefreshing(((Boolean) methodCall.argument("refreshing")).booleanValue());
/* 383 */                       result.success(Boolean.TRUE);
                                break;
                            }
                            break;
                        case "getDefaultSlingshotDistance":
/* 356 */                   result.success(-1);
                            break;
                        case "setEnabled":
/* 317 */                   if (this.pullToRefreshView == null) {
/* 348 */                       result.success(Boolean.FALSE);
                                break;
                            } else {
/* 325 */                       Boolean bool = (Boolean) methodCall.argument("enabled");
/* 327 */                       PullToRefreshLayout pullToRefreshLayout = this.pullToRefreshView;
/* 331 */                       pullToRefreshLayout.settings.enabled = bool;
/* 337 */                       pullToRefreshLayout.setEnabled(bool.booleanValue());
/* 342 */                       result.success(Boolean.TRUE);
                                break;
                            }
                            break;
                        case "setColor":
/* 282 */                   if (this.pullToRefreshView == null) {
/* 311 */                       result.success(Boolean.FALSE);
                                break;
                            } else {
/* 300 */                       this.pullToRefreshView.setColorSchemeColors(Color.parseColor((String) methodCall.argument("color")));
/* 305 */                       result.success(Boolean.TRUE);
                                break;
                            }
                            break;
                        case "setBackgroundColor":
/* 251 */                   if (this.pullToRefreshView == null) {
/* 276 */                       result.success(Boolean.FALSE);
                                break;
                            } else {
/* 265 */                       this.pullToRefreshView.setProgressBackgroundColorSchemeColor(Color.parseColor((String) methodCall.argument("color")));
/* 270 */                       result.success(Boolean.TRUE);
                                break;
                            }
                            break;
                        case "setDistanceToTriggerSync":
/* 218 */                   if (this.pullToRefreshView == null) {
/* 245 */                       result.success(Boolean.FALSE);
                                break;
                            } else {
/* 234 */                       this.pullToRefreshView.setDistanceToTriggerSync(((Integer) methodCall.argument("distanceToTriggerSync")).intValue());
/* 239 */                       result.success(Boolean.TRUE);
                                break;
                            }
                            break;
                        case "isRefreshing":
/* 196 */                   PullToRefreshLayout pullToRefreshLayout2 = this.pullToRefreshView;
/* 212 */                   result.success(Boolean.valueOf(pullToRefreshLayout2 != null && pullToRefreshLayout2.isRefreshing()));
                            break;
                        case "setSize":
/* 165 */                   if (this.pullToRefreshView == null) {
/* 192 */                       result.success(Boolean.FALSE);
                                break;
                            } else {
/* 181 */                       this.pullToRefreshView.setSize(((Integer) methodCall.argument("size")).intValue());
/* 186 */                       result.success(Boolean.TRUE);
                                break;
                            }
                            break;
                        case "isEnabled":
/* 141 */                   PullToRefreshLayout pullToRefreshLayout3 = this.pullToRefreshView;
/* 143 */                   if (pullToRefreshLayout3 == null) {
/* 159 */                       result.success(Boolean.FALSE);
                                break;
                            } else {
/* 153 */                       result.success(Boolean.valueOf(pullToRefreshLayout3.isEnabled()));
                                break;
                            }
                            break;
                        default:
/* 137 */                   result.notImplemented();
                            break;
                    }
                }

                public void onRefresh() {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 15 */            channel.invokeMethod("onRefresh", new HashMap());
                }
            }
