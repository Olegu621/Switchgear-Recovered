            package com.pichillilorenzo.flutter_inappwebview_android.types;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class BaseCallbackResultImpl<T> implements ICallbackResult<T> {
                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                public T decodeResult(Object obj) {
/* 1 */             return null;
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                public void defaultBehaviour(T t) {
                }

                @Override // io.flutter.plugin.common.MethodChannel.Result
                public void error(String str, String str2, Object obj) {
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                public boolean nonNullSuccess(T t) {
/* 1 */             return true;
                }

                @Override // io.flutter.plugin.common.MethodChannel.Result
                public void notImplemented() {
/* 2 */             defaultBehaviour(null);
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                public boolean nullSuccess() {
/* 1 */             return true;
                }

                @Override // io.flutter.plugin.common.MethodChannel.Result
                public void success(Object obj) {
/* 1 */             T tDecodeResult = decodeResult(obj);
/* 16 */            if (tDecodeResult == null ? nullSuccess() : nonNullSuccess(tDecodeResult)) {
/* 18 */                defaultBehaviour(tDecodeResult);
                    }
                }
            }
