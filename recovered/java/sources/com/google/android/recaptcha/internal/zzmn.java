            package com.google.android.recaptcha.internal;

            import java.util.Collection;
            import java.util.Queue;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzmn extends zzml implements Queue {
                @Override // java.util.Queue
                public final Object element() {
/* 5 */             return zzd().element();
                }

                public boolean offer(Object obj) {
/* 5 */             return zzd().offer(obj);
                }

                @Override // java.util.Queue
                public final Object peek() {
/* 5 */             return zzd().peek();
                }

                @Override // java.util.Queue
                public final Object poll() {
/* 5 */             return zzd().poll();
                }

                @Override // java.util.Queue
                public final Object remove() {
/* 5 */             return zzd().remove();
                }

                @Override // com.google.android.recaptcha.internal.zzml
                public /* bridge */ /* synthetic */ Collection zzc() {
/* 2 */             throw null;
                }

                public abstract Queue zzd();
            }
