            package com.google.android.play.core.integrity;

            import android.app.Activity;
            import com.google.android.gms.tasks.Task;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.br */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class C0432br extends StandardIntegrityManager.StandardIntegrityToken {

                /* JADX INFO: renamed from: a */
                private final String f5239a;

                /* JADX INFO: renamed from: b */
                private final AbstractC0461y f5240b;

                public C0432br(String str, AbstractC0461y abstractC0461y) {
/* 4 */             this.f5239a = str;
/* 6 */             this.f5240b = abstractC0461y;
                }

                @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
                public final Task<Integer> showDialog(Activity activity, int i) {
/* 3 */             return this.f5240b.m2503a(activity, i);
                }

                @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken
                public final String token() {
/* 1 */             return this.f5239a;
                }
            }
