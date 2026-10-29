            package com.google.android.gms.internal.drive;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zznj extends IllegalArgumentException {
                public zznj(int i, int i2) {
/* 5 */             StringBuilder sb = new StringBuilder(54);
/* 10 */            sb.append("Unpaired surrogate at index ");
/* 13 */            sb.append(i);
/* 18 */            sb.append(" of ");
/* 21 */            sb.append(i2);
/* 28 */            super(sb.toString());
                }
            }
