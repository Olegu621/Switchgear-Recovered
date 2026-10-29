            package p000;

            import android.content.ClipDescription;
            import android.net.Uri;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.ResultReceiver;
            import android.text.TextUtils;
            import android.view.inputmethod.InputConnection;
            import android.view.inputmethod.InputConnectionWrapper;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class dy0 extends InputConnectionWrapper {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C2357x6 f7445a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public dy0(InputConnection inputConnection, C2357x6 c2357x6) {
/* 4 */             super(inputConnection, false);
/* 1 */             this.f7445a = c2357x6;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
                public final boolean performPrivateCommand(String str, Bundle bundle) throws Throwable {
                    Object[] objArr;
                    ResultReceiver resultReceiver;
/* 1 */             C2357x6 c2357x6 = this.f7445a;
/* 4 */             boolean zM9713d = false;
/* 4 */             zM9713d = false;
/* 4 */             zM9713d = false;
/* 4 */             zM9713d = false;
/* 5 */             if (bundle != null) {
/* 15 */                if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
/* 17 */                    objArr = false;
                        } else if (TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
/* 27 */                    objArr = true;
                        }
                        try {
/* 44 */                    resultReceiver = (ResultReceiver) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
                            try {
/* 59 */                        Uri uri = (Uri) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
/* 72 */                        ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
/* 85 */                        Uri uri2 = (Uri) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
/* 94 */                        int i = bundle.getInt(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
/* 109 */                       Bundle bundle2 = (Bundle) bundle.getParcelable(objArr != false ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
/* 111 */                       if (uri != null && clipDescription != null) {
/* 117 */                           ts0 ts0Var = new ts0();
/* 124 */                           if (Build.VERSION.SDK_INT >= 25) {
/* 131 */                               ts0Var.f17248a = new ey0(uri, clipDescription, uri2);
                                    } else {
/* 141 */                               ts0Var.f17248a = new C0875ec(27, uri, clipDescription, uri2);
                                    }
/* 143 */                           zM9713d = c2357x6.m9713d(ts0Var, i, bundle2);
                                }
/* 147 */                       if (resultReceiver != null) {
/* 149 */                           resultReceiver.send(zM9713d ? 1 : 0, null);
                                }
                            } catch (Throwable th) {
/* 51 */                        th = th;
/* 153 */                       if (resultReceiver != null) {
/* 155 */                           resultReceiver.send(0, null);
                                }
/* 158 */                       throw th;
                            }
                        } catch (Throwable th2) {
/* 34 */                    th = th2;
/* 35 */                    resultReceiver = null;
                        }
                    }
/* 159 */           if (zM9713d) {
/* 3 */                 return true;
                    }
/* 162 */           return super.performPrivateCommand(str, bundle);
                }
            }
