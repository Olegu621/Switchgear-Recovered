            package com.google.android.gms.internal.play_billing;

            import java.io.IOException;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzgs implements zzjw {
                private final zzgr zza;

                private zzgs(zzgr zzgrVar) {
/* 4 */             byte[] bArr = zzhp.zzb;
/* 6 */             this.zza = zzgrVar;
/* 8 */             zzgrVar.zza = this;
                }

                public static zzgs zza(zzgr zzgrVar) {
/* 1 */             zzgs zzgsVar = zzgrVar.zza;
                    return zzgsVar != null ? zzgsVar : new zzgs(zzgrVar);
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                public final void zzA(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzib)) {
/* 73 */                if (!z) {
/* 135 */                   while (i2 < list.size()) {
/* 149 */                       this.zza.zzh(i, ((Long) list.get(i2)).longValue());
/* 152 */                       i2++;
                            }
/* 155 */                   return;
                        }
/* 77 */                this.zza.zzr(i, 2);
/* 81 */                int i3 = 0;
/* 86 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 94 */                    ((Long) list.get(i4)).getClass();
/* 97 */                    i3 += 8;
                        }
/* 104 */               this.zza.zzt(i3);
/* 111 */               while (i2 < list.size()) {
/* 125 */                   this.zza.zzi(((Long) list.get(i2)).longValue());
/* 128 */                   i2++;
                        }
/* 155 */               return;
                    }
/* 7 */             zzib zzibVar = (zzib) list;
/* 9 */             if (!z) {
/* 59 */                while (i2 < zzibVar.size()) {
/* 67 */                    this.zza.zzh(i, zzibVar.zze(i2));
/* 70 */                    i2++;
                        }
/* 155 */               return;
                    }
/* 13 */            this.zza.zzr(i, 2);
/* 17 */            int i5 = 0;
/* 22 */            for (int i6 = 0; i6 < zzibVar.size(); i6++) {
/* 24 */                zzibVar.zze(i6);
/* 27 */                i5 += 8;
                    }
/* 34 */            this.zza.zzt(i5);
/* 41 */            while (i2 < zzibVar.size()) {
/* 49 */                this.zza.zzi(zzibVar.zze(i2));
/* 52 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                public final void zzB(int i, int i2) throws IOException {
/* 6 */             zzgr zzgrVar = this.zza;
/* 8 */             zzgrVar.zzs(i, (i2 >> 31) ^ (i2 + i2));
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                public final void zzC(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzhl)) {
/* 92 */                if (!z) {
/* 168 */                   while (i2 < list.size()) {
/* 170 */                       zzgr zzgrVar = this.zza;
/* 178 */                       int iIntValue = ((Integer) list.get(i2)).intValue();
/* 187 */                       zzgrVar.zzs(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
/* 190 */                       i2++;
                            }
/* 193 */                   return;
                        }
/* 96 */                this.zza.zzr(i, 2);
/* 100 */               int iZzz = 0;
/* 105 */               for (int i3 = 0; i3 < list.size(); i3++) {
/* 113 */                   int iIntValue2 = ((Integer) list.get(i3)).intValue();
/* 126 */                   iZzz += zzgr.zzz((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
                        }
/* 132 */               this.zza.zzt(iZzz);
/* 139 */               while (i2 < list.size()) {
/* 141 */                   zzgr zzgrVar2 = this.zza;
/* 149 */                   int iIntValue3 = ((Integer) list.get(i2)).intValue();
/* 158 */                   zzgrVar2.zzt((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
/* 161 */                   i2++;
                        }
/* 193 */               return;
                    }
/* 7 */             zzhl zzhlVar = (zzhl) list;
/* 9 */             if (!z) {
/* 73 */                while (i2 < zzhlVar.size()) {
/* 75 */                    zzgr zzgrVar3 = this.zza;
/* 77 */                    int iZze = zzhlVar.zze(i2);
/* 86 */                    zzgrVar3.zzs(i, (iZze >> 31) ^ (iZze + iZze));
/* 89 */                    i2++;
                        }
/* 193 */               return;
                    }
/* 13 */            this.zza.zzr(i, 2);
/* 17 */            int iZzz2 = 0;
/* 22 */            for (int i4 = 0; i4 < zzhlVar.size(); i4++) {
/* 24 */                int iZze2 = zzhlVar.zze(i4);
/* 37 */                iZzz2 += zzgr.zzz((iZze2 >> 31) ^ (iZze2 + iZze2));
                    }
/* 43 */            this.zza.zzt(iZzz2);
/* 50 */            while (i2 < zzhlVar.size()) {
/* 52 */                zzgr zzgrVar4 = this.zza;
/* 54 */                int iZze3 = zzhlVar.zze(i2);
/* 63 */                zzgrVar4.zzt((iZze3 >> 31) ^ (iZze3 + iZze3));
/* 66 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                public final void zzD(int i, long j) throws IOException {
/* 7 */             zzgr zzgrVar = this.zza;
/* 9 */             zzgrVar.zzu(i, (j >> 63) ^ (j + j));
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                public final void zzE(int i, List list, boolean z) throws IOException {
/* 6 */             int i2 = 0;
/* 7 */             if (!(list instanceof zzib)) {
/* 91 */                if (!z) {
/* 165 */                   while (i2 < list.size()) {
/* 167 */                       zzgr zzgrVar = this.zza;
/* 175 */                       long jLongValue = ((Long) list.get(i2)).longValue();
/* 183 */                       zzgrVar.zzu(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
/* 186 */                       i2++;
                            }
/* 189 */                   return;
                        }
/* 95 */                this.zza.zzr(i, 2);
/* 99 */                int iZzA = 0;
/* 104 */               for (int i3 = 0; i3 < list.size(); i3++) {
/* 112 */                   long jLongValue2 = ((Long) list.get(i3)).longValue();
/* 124 */                   iZzA += zzgr.zzA((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
                        }
/* 130 */               this.zza.zzt(iZzA);
/* 137 */               while (i2 < list.size()) {
/* 139 */                   zzgr zzgrVar2 = this.zza;
/* 147 */                   long jLongValue3 = ((Long) list.get(i2)).longValue();
/* 155 */                   zzgrVar2.zzv((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
/* 158 */                   i2++;
                        }
/* 189 */               return;
                    }
/* 9 */             zzib zzibVar = (zzib) list;
/* 11 */            if (!z) {
/* 73 */                while (i2 < zzibVar.size()) {
/* 75 */                    zzgr zzgrVar3 = this.zza;
/* 77 */                    long jZze = zzibVar.zze(i2);
/* 85 */                    zzgrVar3.zzu(i, (jZze >> 63) ^ (jZze + jZze));
/* 88 */                    i2++;
                        }
/* 189 */               return;
                    }
/* 15 */            this.zza.zzr(i, 2);
/* 19 */            int iZzA2 = 0;
/* 24 */            for (int i4 = 0; i4 < zzibVar.size(); i4++) {
/* 26 */                long jZze2 = zzibVar.zze(i4);
/* 38 */                iZzA2 += zzgr.zzA((jZze2 >> 63) ^ (jZze2 + jZze2));
                    }
/* 44 */            this.zza.zzt(iZzA2);
/* 51 */            while (i2 < zzibVar.size()) {
/* 53 */                zzgr zzgrVar4 = this.zza;
/* 55 */                long jZze3 = zzibVar.zze(i2);
/* 63 */                zzgrVar4.zzv((jZze3 >> 63) ^ (jZze3 + jZze3));
/* 66 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                @Deprecated
                public final void zzF(int i) throws IOException {
/* 4 */             this.zza.zzr(i, 3);
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                public final void zzG(int i, String str) throws IOException {
/* 3 */             this.zza.zzp(i, str);
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                public final void zzH(int i, List list) throws IOException {
/* 3 */             int i2 = 0;
/* 4 */             if (!(list instanceof zzhy)) {
/* 43 */                while (i2 < list.size()) {
/* 53 */                    this.zza.zzp(i, (String) list.get(i2));
/* 56 */                    i2++;
                        }
/* 59 */                return;
                    }
/* 7 */             zzhy zzhyVar = (zzhy) list;
/* 13 */            while (i2 < list.size()) {
/* 15 */                Object objZzc = zzhyVar.zzc();
/* 19 */                boolean z = objZzc instanceof String;
/* 21 */                zzgr zzgrVar = this.zza;
/* 23 */                if (z) {
/* 27 */                    zzgrVar.zzp(i, (String) objZzc);
                        } else {
/* 33 */                    zzgrVar.zze(i, (zzgk) objZzc);
                        }
/* 36 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                public final void zzI(int i, int i2) throws IOException {
/* 3 */             this.zza.zzs(i, i2);
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                public final void zzJ(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzhl)) {
/* 77 */                if (!z) {
/* 143 */                   while (i2 < list.size()) {
/* 157 */                       this.zza.zzs(i, ((Integer) list.get(i2)).intValue());
/* 160 */                       i2++;
                            }
/* 163 */                   return;
                        }
/* 81 */                this.zza.zzr(i, 2);
/* 85 */                int iZzz = 0;
/* 90 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 106 */                   iZzz += zzgr.zzz(((Integer) list.get(i3)).intValue());
                        }
/* 112 */               this.zza.zzt(iZzz);
/* 119 */               while (i2 < list.size()) {
/* 133 */                   this.zza.zzt(((Integer) list.get(i2)).intValue());
/* 136 */                   i2++;
                        }
/* 163 */               return;
                    }
/* 7 */             zzhl zzhlVar = (zzhl) list;
/* 9 */             if (!z) {
/* 63 */                while (i2 < zzhlVar.size()) {
/* 71 */                    this.zza.zzs(i, zzhlVar.zze(i2));
/* 74 */                    i2++;
                        }
/* 163 */               return;
                    }
/* 13 */            this.zza.zzr(i, 2);
/* 17 */            int iZzz2 = 0;
/* 22 */            for (int i4 = 0; i4 < zzhlVar.size(); i4++) {
/* 32 */                iZzz2 += zzgr.zzz(zzhlVar.zze(i4));
                    }
/* 38 */            this.zza.zzt(iZzz2);
/* 45 */            while (i2 < zzhlVar.size()) {
/* 53 */                this.zza.zzt(zzhlVar.zze(i2));
/* 56 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                public final void zzK(int i, long j) throws IOException {
/* 3 */             this.zza.zzu(i, j);
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                public final void zzL(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzib)) {
/* 77 */                if (!z) {
/* 143 */                   while (i2 < list.size()) {
/* 157 */                       this.zza.zzu(i, ((Long) list.get(i2)).longValue());
/* 160 */                       i2++;
                            }
/* 163 */                   return;
                        }
/* 81 */                this.zza.zzr(i, 2);
/* 85 */                int iZzA = 0;
/* 90 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 106 */                   iZzA += zzgr.zzA(((Long) list.get(i3)).longValue());
                        }
/* 112 */               this.zza.zzt(iZzA);
/* 119 */               while (i2 < list.size()) {
/* 133 */                   this.zza.zzv(((Long) list.get(i2)).longValue());
/* 136 */                   i2++;
                        }
/* 163 */               return;
                    }
/* 7 */             zzib zzibVar = (zzib) list;
/* 9 */             if (!z) {
/* 63 */                while (i2 < zzibVar.size()) {
/* 71 */                    this.zza.zzu(i, zzibVar.zze(i2));
/* 74 */                    i2++;
                        }
/* 163 */               return;
                    }
/* 13 */            this.zza.zzr(i, 2);
/* 17 */            int iZzA2 = 0;
/* 22 */            for (int i4 = 0; i4 < zzibVar.size(); i4++) {
/* 32 */                iZzA2 += zzgr.zzA(zzibVar.zze(i4));
                    }
/* 38 */            this.zza.zzt(iZzA2);
/* 45 */            while (i2 < zzibVar.size()) {
/* 53 */                this.zza.zzv(zzibVar.zze(i2));
/* 56 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                public final void zzb(int i, boolean z) throws IOException {
/* 3 */             this.zza.zzd(i, z);
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // com.google.android.gms.internal.play_billing.zzjw
                public final void zzc(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzgb)) {
/* 73 */                if (!z) {
/* 135 */                   while (i2 < list.size()) {
/* 149 */                       this.zza.zzd(i, ((Boolean) list.get(i2)).booleanValue());
/* 152 */                       i2++;
                            }
/* 155 */                   return;
                        }
/* 77 */                this.zza.zzr(i, 2);
/* 81 */                int i3 = 0;
/* 86 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 94 */                    ((Boolean) list.get(i4)).getClass();
/* 97 */                    i3++;
                        }
/* 104 */               this.zza.zzt(i3);
/* 111 */               while (i2 < list.size()) {
/* 125 */                   this.zza.zzb(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
/* 128 */                   i2++;
                        }
/* 155 */               return;
                    }
/* 7 */             zzgb zzgbVar = (zzgb) list;
/* 9 */             if (!z) {
/* 59 */                while (i2 < zzgbVar.size()) {
/* 67 */                    this.zza.zzd(i, zzgbVar.zzf(i2));
/* 70 */                    i2++;
                        }
/* 155 */               return;
                    }
/* 13 */            this.zza.zzr(i, 2);
/* 17 */            int i5 = 0;
/* 22 */            for (int i6 = 0; i6 < zzgbVar.size(); i6++) {
/* 24 */                zzgbVar.zzf(i6);
/* 27 */                i5++;
                    }
/* 34 */            this.zza.zzt(i5);
/* 41 */            while (i2 < zzgbVar.size()) {
/* 49 */                this.zza.zzb(zzgbVar.zzf(i2) ? (byte) 1 : (byte) 0);
/* 52 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                public final void zzd(int i, zzgk zzgkVar) throws IOException {
/* 3 */             this.zza.zze(i, zzgkVar);
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                public final void zze(int i, List list) throws IOException {
/* 6 */             for (int i2 = 0; i2 < list.size(); i2++) {
/* 16 */                this.zza.zze(i, (zzgk) list.get(i2));
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                public final void zzf(int i, double d) throws IOException {
/* 7 */             this.zza.zzh(i, Double.doubleToRawLongBits(d));
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                public final void zzg(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzgt)) {
/* 81 */                if (!z) {
/* 147 */                   while (i2 < list.size()) {
/* 165 */                       this.zza.zzh(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
/* 168 */                       i2++;
                            }
/* 171 */                   return;
                        }
/* 85 */                this.zza.zzr(i, 2);
/* 89 */                int i3 = 0;
/* 94 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 102 */                   ((Double) list.get(i4)).getClass();
/* 105 */                   i3 += 8;
                        }
/* 112 */               this.zza.zzt(i3);
/* 119 */               while (i2 < list.size()) {
/* 137 */                   this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
/* 140 */                   i2++;
                        }
/* 171 */               return;
                    }
/* 7 */             zzgt zzgtVar = (zzgt) list;
/* 9 */             if (!z) {
/* 63 */                while (i2 < zzgtVar.size()) {
/* 75 */                    this.zza.zzh(i, Double.doubleToRawLongBits(zzgtVar.zze(i2)));
/* 78 */                    i2++;
                        }
/* 171 */               return;
                    }
/* 13 */            this.zza.zzr(i, 2);
/* 17 */            int i5 = 0;
/* 22 */            for (int i6 = 0; i6 < zzgtVar.size(); i6++) {
/* 24 */                zzgtVar.zze(i6);
/* 27 */                i5 += 8;
                    }
/* 34 */            this.zza.zzt(i5);
/* 41 */            while (i2 < zzgtVar.size()) {
/* 53 */                this.zza.zzi(Double.doubleToRawLongBits(zzgtVar.zze(i2)));
/* 56 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                @Deprecated
                public final void zzh(int i) throws IOException {
/* 4 */             this.zza.zzr(i, 4);
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                public final void zzi(int i, int i2) throws IOException {
/* 3 */             this.zza.zzj(i, i2);
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                public final void zzj(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzhl)) {
/* 78 */                if (!z) {
/* 145 */                   while (i2 < list.size()) {
/* 159 */                       this.zza.zzj(i, ((Integer) list.get(i2)).intValue());
/* 162 */                       i2++;
                            }
/* 165 */                   return;
                        }
/* 82 */                this.zza.zzr(i, 2);
/* 86 */                int iZzA = 0;
/* 91 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 108 */                   iZzA += zzgr.zzA(((Integer) list.get(i3)).intValue());
                        }
/* 114 */               this.zza.zzt(iZzA);
/* 121 */               while (i2 < list.size()) {
/* 135 */                   this.zza.zzk(((Integer) list.get(i2)).intValue());
/* 138 */                   i2++;
                        }
/* 165 */               return;
                    }
/* 7 */             zzhl zzhlVar = (zzhl) list;
/* 9 */             if (!z) {
/* 64 */                while (i2 < zzhlVar.size()) {
/* 72 */                    this.zza.zzj(i, zzhlVar.zze(i2));
/* 75 */                    i2++;
                        }
/* 165 */               return;
                    }
/* 13 */            this.zza.zzr(i, 2);
/* 17 */            int iZzA2 = 0;
/* 22 */            for (int i4 = 0; i4 < zzhlVar.size(); i4++) {
/* 33 */                iZzA2 += zzgr.zzA(zzhlVar.zze(i4));
                    }
/* 39 */            this.zza.zzt(iZzA2);
/* 46 */            while (i2 < zzhlVar.size()) {
/* 54 */                this.zza.zzk(zzhlVar.zze(i2));
/* 57 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                public final void zzk(int i, int i2) throws IOException {
/* 3 */             this.zza.zzf(i, i2);
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                public final void zzl(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzhl)) {
/* 73 */                if (!z) {
/* 135 */                   while (i2 < list.size()) {
/* 149 */                       this.zza.zzf(i, ((Integer) list.get(i2)).intValue());
/* 152 */                       i2++;
                            }
/* 155 */                   return;
                        }
/* 77 */                this.zza.zzr(i, 2);
/* 81 */                int i3 = 0;
/* 86 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 94 */                    ((Integer) list.get(i4)).getClass();
/* 97 */                    i3 += 4;
                        }
/* 104 */               this.zza.zzt(i3);
/* 111 */               while (i2 < list.size()) {
/* 125 */                   this.zza.zzg(((Integer) list.get(i2)).intValue());
/* 128 */                   i2++;
                        }
/* 155 */               return;
                    }
/* 7 */             zzhl zzhlVar = (zzhl) list;
/* 9 */             if (!z) {
/* 59 */                while (i2 < zzhlVar.size()) {
/* 67 */                    this.zza.zzf(i, zzhlVar.zze(i2));
/* 70 */                    i2++;
                        }
/* 155 */               return;
                    }
/* 13 */            this.zza.zzr(i, 2);
/* 17 */            int i5 = 0;
/* 22 */            for (int i6 = 0; i6 < zzhlVar.size(); i6++) {
/* 24 */                zzhlVar.zze(i6);
/* 27 */                i5 += 4;
                    }
/* 34 */            this.zza.zzt(i5);
/* 41 */            while (i2 < zzhlVar.size()) {
/* 49 */                this.zza.zzg(zzhlVar.zze(i2));
/* 52 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                public final void zzm(int i, long j) throws IOException {
/* 3 */             this.zza.zzh(i, j);
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                public final void zzn(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzib)) {
/* 73 */                if (!z) {
/* 135 */                   while (i2 < list.size()) {
/* 149 */                       this.zza.zzh(i, ((Long) list.get(i2)).longValue());
/* 152 */                       i2++;
                            }
/* 155 */                   return;
                        }
/* 77 */                this.zza.zzr(i, 2);
/* 81 */                int i3 = 0;
/* 86 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 94 */                    ((Long) list.get(i4)).getClass();
/* 97 */                    i3 += 8;
                        }
/* 104 */               this.zza.zzt(i3);
/* 111 */               while (i2 < list.size()) {
/* 125 */                   this.zza.zzi(((Long) list.get(i2)).longValue());
/* 128 */                   i2++;
                        }
/* 155 */               return;
                    }
/* 7 */             zzib zzibVar = (zzib) list;
/* 9 */             if (!z) {
/* 59 */                while (i2 < zzibVar.size()) {
/* 67 */                    this.zza.zzh(i, zzibVar.zze(i2));
/* 70 */                    i2++;
                        }
/* 155 */               return;
                    }
/* 13 */            this.zza.zzr(i, 2);
/* 17 */            int i5 = 0;
/* 22 */            for (int i6 = 0; i6 < zzibVar.size(); i6++) {
/* 24 */                zzibVar.zze(i6);
/* 27 */                i5 += 8;
                    }
/* 34 */            this.zza.zzt(i5);
/* 41 */            while (i2 < zzibVar.size()) {
/* 49 */                this.zza.zzi(zzibVar.zze(i2));
/* 52 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                public final void zzo(int i, float f) throws IOException {
/* 7 */             this.zza.zzf(i, Float.floatToRawIntBits(f));
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                public final void zzp(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzhd)) {
/* 81 */                if (!z) {
/* 147 */                   while (i2 < list.size()) {
/* 165 */                       this.zza.zzf(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
/* 168 */                       i2++;
                            }
/* 171 */                   return;
                        }
/* 85 */                this.zza.zzr(i, 2);
/* 89 */                int i3 = 0;
/* 94 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 102 */                   ((Float) list.get(i4)).getClass();
/* 105 */                   i3 += 4;
                        }
/* 112 */               this.zza.zzt(i3);
/* 119 */               while (i2 < list.size()) {
/* 137 */                   this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
/* 140 */                   i2++;
                        }
/* 171 */               return;
                    }
/* 7 */             zzhd zzhdVar = (zzhd) list;
/* 9 */             if (!z) {
/* 63 */                while (i2 < zzhdVar.size()) {
/* 75 */                    this.zza.zzf(i, Float.floatToRawIntBits(zzhdVar.zze(i2)));
/* 78 */                    i2++;
                        }
/* 171 */               return;
                    }
/* 13 */            this.zza.zzr(i, 2);
/* 17 */            int i5 = 0;
/* 22 */            for (int i6 = 0; i6 < zzhdVar.size(); i6++) {
/* 24 */                zzhdVar.zze(i6);
/* 27 */                i5 += 4;
                    }
/* 34 */            this.zza.zzt(i5);
/* 41 */            while (i2 < zzhdVar.size()) {
/* 53 */                this.zza.zzg(Float.floatToRawIntBits(zzhdVar.zze(i2)));
/* 56 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                public final void zzq(int i, Object obj, zzix zzixVar) throws IOException {
/* 3 */             zzgr zzgrVar = this.zza;
/* 6 */             zzgrVar.zzr(i, 3);
/* 11 */            zzixVar.zzi((zzim) obj, zzgrVar.zza);
/* 15 */            zzgrVar.zzr(i, 4);
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                public final void zzr(int i, int i2) throws IOException {
/* 3 */             this.zza.zzj(i, i2);
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                public final void zzs(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzhl)) {
/* 78 */                if (!z) {
/* 145 */                   while (i2 < list.size()) {
/* 159 */                       this.zza.zzj(i, ((Integer) list.get(i2)).intValue());
/* 162 */                       i2++;
                            }
/* 165 */                   return;
                        }
/* 82 */                this.zza.zzr(i, 2);
/* 86 */                int iZzA = 0;
/* 91 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 108 */                   iZzA += zzgr.zzA(((Integer) list.get(i3)).intValue());
                        }
/* 114 */               this.zza.zzt(iZzA);
/* 121 */               while (i2 < list.size()) {
/* 135 */                   this.zza.zzk(((Integer) list.get(i2)).intValue());
/* 138 */                   i2++;
                        }
/* 165 */               return;
                    }
/* 7 */             zzhl zzhlVar = (zzhl) list;
/* 9 */             if (!z) {
/* 64 */                while (i2 < zzhlVar.size()) {
/* 72 */                    this.zza.zzj(i, zzhlVar.zze(i2));
/* 75 */                    i2++;
                        }
/* 165 */               return;
                    }
/* 13 */            this.zza.zzr(i, 2);
/* 17 */            int iZzA2 = 0;
/* 22 */            for (int i4 = 0; i4 < zzhlVar.size(); i4++) {
/* 33 */                iZzA2 += zzgr.zzA(zzhlVar.zze(i4));
                    }
/* 39 */            this.zza.zzt(iZzA2);
/* 46 */            while (i2 < zzhlVar.size()) {
/* 54 */                this.zza.zzk(zzhlVar.zze(i2));
/* 57 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                public final void zzt(int i, long j) throws IOException {
/* 3 */             this.zza.zzu(i, j);
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                public final void zzu(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzib)) {
/* 77 */                if (!z) {
/* 143 */                   while (i2 < list.size()) {
/* 157 */                       this.zza.zzu(i, ((Long) list.get(i2)).longValue());
/* 160 */                       i2++;
                            }
/* 163 */                   return;
                        }
/* 81 */                this.zza.zzr(i, 2);
/* 85 */                int iZzA = 0;
/* 90 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 106 */                   iZzA += zzgr.zzA(((Long) list.get(i3)).longValue());
                        }
/* 112 */               this.zza.zzt(iZzA);
/* 119 */               while (i2 < list.size()) {
/* 133 */                   this.zza.zzv(((Long) list.get(i2)).longValue());
/* 136 */                   i2++;
                        }
/* 163 */               return;
                    }
/* 7 */             zzib zzibVar = (zzib) list;
/* 9 */             if (!z) {
/* 63 */                while (i2 < zzibVar.size()) {
/* 71 */                    this.zza.zzu(i, zzibVar.zze(i2));
/* 74 */                    i2++;
                        }
/* 163 */               return;
                    }
/* 13 */            this.zza.zzr(i, 2);
/* 17 */            int iZzA2 = 0;
/* 22 */            for (int i4 = 0; i4 < zzibVar.size(); i4++) {
/* 32 */                iZzA2 += zzgr.zzA(zzibVar.zze(i4));
                    }
/* 38 */            this.zza.zzt(iZzA2);
/* 45 */            while (i2 < zzibVar.size()) {
/* 53 */                this.zza.zzv(zzibVar.zze(i2));
/* 56 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                public final void zzv(int i, Object obj, zzix zzixVar) throws IOException {
/* 5 */             this.zza.zzm(i, (zzim) obj, zzixVar);
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                public final void zzw(int i, Object obj) throws IOException {
/* 1 */             boolean z = obj instanceof zzgk;
/* 3 */             zzgr zzgrVar = this.zza;
/* 5 */             if (z) {
/* 9 */                 zzgrVar.zzo(i, (zzgk) obj);
                    } else {
/* 15 */                zzgrVar.zzn(i, (zzim) obj);
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                public final void zzx(int i, int i2) throws IOException {
/* 3 */             this.zza.zzf(i, i2);
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                public final void zzy(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzhl)) {
/* 73 */                if (!z) {
/* 135 */                   while (i2 < list.size()) {
/* 149 */                       this.zza.zzf(i, ((Integer) list.get(i2)).intValue());
/* 152 */                       i2++;
                            }
/* 155 */                   return;
                        }
/* 77 */                this.zza.zzr(i, 2);
/* 81 */                int i3 = 0;
/* 86 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 94 */                    ((Integer) list.get(i4)).getClass();
/* 97 */                    i3 += 4;
                        }
/* 104 */               this.zza.zzt(i3);
/* 111 */               while (i2 < list.size()) {
/* 125 */                   this.zza.zzg(((Integer) list.get(i2)).intValue());
/* 128 */                   i2++;
                        }
/* 155 */               return;
                    }
/* 7 */             zzhl zzhlVar = (zzhl) list;
/* 9 */             if (!z) {
/* 59 */                while (i2 < zzhlVar.size()) {
/* 67 */                    this.zza.zzf(i, zzhlVar.zze(i2));
/* 70 */                    i2++;
                        }
/* 155 */               return;
                    }
/* 13 */            this.zza.zzr(i, 2);
/* 17 */            int i5 = 0;
/* 22 */            for (int i6 = 0; i6 < zzhlVar.size(); i6++) {
/* 24 */                zzhlVar.zze(i6);
/* 27 */                i5 += 4;
                    }
/* 34 */            this.zza.zzt(i5);
/* 41 */            while (i2 < zzhlVar.size()) {
/* 49 */                this.zza.zzg(zzhlVar.zze(i2));
/* 52 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.play_billing.zzjw
                public final void zzz(int i, long j) throws IOException {
/* 3 */             this.zza.zzh(i, j);
                }
            }
