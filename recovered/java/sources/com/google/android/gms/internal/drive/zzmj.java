            package com.google.android.gms.internal.drive;

            import java.util.Collections;
            import java.util.List;
            import java.util.Map;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzmj extends zzmi {
                public zzmj(int i) {
/* 2 */             super(i, null);
                }

                @Override // com.google.android.gms.internal.drive.zzmi
                public final void zzbp() {
/* 5 */             if (!isImmutable()) {
/* 12 */                for (int i = 0; i < zzer(); i++) {
/* 14 */                    Map.Entry entryZzaw = zzaw(i);
/* 28 */                    if (((zzkd) entryZzaw.getKey()).zzcs()) {
/* 40 */                        entryZzaw.setValue(Collections.unmodifiableList((List) entryZzaw.getValue()));
                            }
                        }
/* 58 */                for (Map.Entry entry : zzes()) {
/* 76 */                    if (((zzkd) entry.getKey()).zzcs()) {
/* 88 */                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                            }
                        }
                    }
/* 92 */            super.zzbp();
                }
            }
