            package com.google.android.gms.internal.drive;

            import java.util.Iterator;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 6 */     final class zzml extends zzmr {
                private final /* synthetic */ zzmi zzvk;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                private zzml(zzmi zzmiVar) {
/* 4 */             super(zzmiVar, null);
/* 1 */             this.zzvk = zzmiVar;
                }

                @Override // com.google.android.gms.internal.drive.zzmr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public final Iterator iterator() {
/* 6 */             return new zzmk(this.zzvk, null);
                }

/* 7 */         public /* synthetic */ zzml(zzmi zzmiVar, zzmj zzmjVar) {
/* 8 */             this(zzmiVar);
                }
            }
