            package com.pichillilorenzo.flutter_inappwebview_android.types;

            import java.util.concurrent.CountDownLatch;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class SyncBaseCallbackResultImpl<T> extends BaseCallbackResultImpl<T> {
                public final CountDownLatch latch = new CountDownLatch(1);
                public T result = null;

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                public void defaultBehaviour(T t) {
/* 3 */             this.latch.countDown();
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, io.flutter.plugin.common.MethodChannel.Result
                public void error(String str, String str2, Object obj) {
/* 3 */             this.latch.countDown();
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, io.flutter.plugin.common.MethodChannel.Result
                public void notImplemented() {
/* 2 */             defaultBehaviour(null);
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, io.flutter.plugin.common.MethodChannel.Result
                public void success(Object obj) {
/* 1 */             T tDecodeResult = decodeResult(obj);
/* 5 */             this.result = tDecodeResult;
/* 18 */            if (tDecodeResult == null ? nullSuccess() : nonNullSuccess(tDecodeResult)) {
/* 20 */                defaultBehaviour(tDecodeResult);
                    } else {
/* 26 */                this.latch.countDown();
                    }
                }
            }
