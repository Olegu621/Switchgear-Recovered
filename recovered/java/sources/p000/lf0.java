            package p000;

            import android.content.Context;
            import android.content.SharedPreferences;
            import com.google.android.gms.tasks.OnSuccessListener;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 7 */     public final /* synthetic */ class lf0 implements OnSuccessListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ boolean f13221a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f13222b;

                public /* synthetic */ lf0(Context context, boolean z) {
/* 4 */             this.f13222b = context;
/* 6 */             this.f13221a = z;
                }

                /* JADX INFO: renamed from: a */
                public void m6431a(Throwable th) {
/* 3 */             String str = (String) this.f13222b;
/* 5 */             String localizedMessage = th.getLocalizedMessage();
/* 9 */             if (localizedMessage == null) {
/* 11 */                localizedMessage = "No message provided.";
                    }
/* 15 */            if (this.f13221a) {
/* 21 */                k50.m5957K(str, localizedMessage, th);
                    } else {
/* 29 */                k50.m5980q(str, localizedMessage, th);
                    }
                }

                @Override // com.google.android.gms.tasks.OnSuccessListener
                public void onSuccess(Object obj) {
/* 11 */            SharedPreferences.Editor editorEdit = py0.m7606i0((Context) this.f13222b).edit();
/* 19 */            editorEdit.putBoolean("proxy_retention", this.f13221a);
/* 22 */            editorEdit.apply();
                }

/* 8 */         public /* synthetic */ lf0(String str, boolean z) {
                    this.f13221a = z;
                    this.f13222b = str;
                }
            }
