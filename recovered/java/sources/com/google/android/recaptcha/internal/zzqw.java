            package com.google.android.recaptcha.internal;

            import java.io.IOException;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzqw implements zzvi {
                private final zzqv zza;

                private zzqw(zzqv zzqvVar) {
/* 4 */             byte[] bArr = zzsv.zzb;
/* 6 */             this.zza = zzqvVar;
/* 8 */             zzqvVar.zza = this;
                }

                public static zzqw zza(zzqv zzqvVar) {
/* 1 */             zzqw zzqwVar = zzqvVar.zza;
                    return zzqwVar != null ? zzqwVar : new zzqw(zzqvVar);
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                public final void zzA(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzth)) {
/* 69 */                if (!z) {
/* 127 */                   while (i2 < list.size()) {
/* 141 */                       this.zza.zzh(i, ((Long) list.get(i2)).longValue());
/* 144 */                       i2++;
                            }
/* 147 */                   return;
                        }
/* 71 */                zzqv zzqvVar = this.zza;
/* 73 */                zzqvVar.zzr(i, 2);
/* 77 */                int i3 = 0;
/* 82 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 90 */                    ((Long) list.get(i4)).getClass();
/* 93 */                    i3 += 8;
                        }
/* 98 */                zzqvVar.zzt(i3);
/* 105 */               while (i2 < list.size()) {
/* 117 */                   zzqvVar.zzi(((Long) list.get(i2)).longValue());
/* 120 */                   i2++;
                        }
/* 147 */               return;
                    }
/* 7 */             zzth zzthVar = (zzth) list;
/* 9 */             if (!z) {
/* 55 */                while (i2 < zzthVar.size()) {
/* 63 */                    this.zza.zzh(i, zzthVar.zze(i2));
/* 66 */                    i2++;
                        }
/* 147 */               return;
                    }
/* 11 */            zzqv zzqvVar2 = this.zza;
/* 13 */            zzqvVar2.zzr(i, 2);
/* 17 */            int i5 = 0;
/* 22 */            for (int i6 = 0; i6 < zzthVar.size(); i6++) {
/* 24 */                zzthVar.zze(i6);
/* 27 */                i5 += 8;
                    }
/* 32 */            zzqvVar2.zzt(i5);
/* 39 */            while (i2 < zzthVar.size()) {
/* 45 */                zzqvVar2.zzi(zzthVar.zze(i2));
/* 48 */                i2++;
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                public final void zzB(int i, int i2) throws IOException {
/* 6 */             zzqv zzqvVar = this.zza;
/* 8 */             zzqvVar.zzs(i, (i2 >> 31) ^ (i2 + i2));
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                public final void zzC(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzso)) {
/* 88 */                if (!z) {
/* 160 */                   while (i2 < list.size()) {
/* 162 */                       zzqv zzqvVar = this.zza;
/* 170 */                       int iIntValue = ((Integer) list.get(i2)).intValue();
/* 179 */                       zzqvVar.zzs(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
/* 182 */                       i2++;
                            }
/* 185 */                   return;
                        }
/* 90 */                zzqv zzqvVar2 = this.zza;
/* 92 */                zzqvVar2.zzr(i, 2);
/* 96 */                int iZzA = 0;
/* 101 */               for (int i3 = 0; i3 < list.size(); i3++) {
/* 109 */                   int iIntValue2 = ((Integer) list.get(i3)).intValue();
/* 122 */                   iZzA += zzqv.zzA((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
                        }
/* 126 */               zzqvVar2.zzt(iZzA);
/* 133 */               while (i2 < list.size()) {
/* 141 */                   int iIntValue3 = ((Integer) list.get(i2)).intValue();
/* 150 */                   zzqvVar2.zzt((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
/* 153 */                   i2++;
                        }
/* 185 */               return;
                    }
/* 7 */             zzso zzsoVar = (zzso) list;
/* 9 */             if (!z) {
/* 69 */                while (i2 < zzsoVar.size()) {
/* 71 */                    zzqv zzqvVar3 = this.zza;
/* 73 */                    int iZze = zzsoVar.zze(i2);
/* 82 */                    zzqvVar3.zzs(i, (iZze >> 31) ^ (iZze + iZze));
/* 85 */                    i2++;
                        }
/* 185 */               return;
                    }
/* 11 */            zzqv zzqvVar4 = this.zza;
/* 13 */            zzqvVar4.zzr(i, 2);
/* 17 */            int iZzA2 = 0;
/* 22 */            for (int i4 = 0; i4 < zzsoVar.size(); i4++) {
/* 24 */                int iZze2 = zzsoVar.zze(i4);
/* 37 */                iZzA2 += zzqv.zzA((iZze2 >> 31) ^ (iZze2 + iZze2));
                    }
/* 41 */            zzqvVar4.zzt(iZzA2);
/* 48 */            while (i2 < zzsoVar.size()) {
/* 50 */                int iZze3 = zzsoVar.zze(i2);
/* 59 */                zzqvVar4.zzt((iZze3 >> 31) ^ (iZze3 + iZze3));
/* 62 */                i2++;
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                public final void zzD(int i, long j) throws IOException {
/* 7 */             zzqv zzqvVar = this.zza;
/* 9 */             zzqvVar.zzu(i, (j >> 63) ^ (j + j));
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                public final void zzE(int i, List list, boolean z) throws IOException {
/* 6 */             int i2 = 0;
/* 7 */             if (!(list instanceof zzth)) {
/* 87 */                if (!z) {
/* 157 */                   while (i2 < list.size()) {
/* 159 */                       zzqv zzqvVar = this.zza;
/* 167 */                       long jLongValue = ((Long) list.get(i2)).longValue();
/* 175 */                       zzqvVar.zzu(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
/* 178 */                       i2++;
                            }
/* 181 */                   return;
                        }
/* 89 */                zzqv zzqvVar2 = this.zza;
/* 91 */                zzqvVar2.zzr(i, 2);
/* 95 */                int iZzB = 0;
/* 100 */               for (int i3 = 0; i3 < list.size(); i3++) {
/* 108 */                   long jLongValue2 = ((Long) list.get(i3)).longValue();
/* 120 */                   iZzB += zzqv.zzB((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
                        }
/* 124 */               zzqvVar2.zzt(iZzB);
/* 131 */               while (i2 < list.size()) {
/* 139 */                   long jLongValue3 = ((Long) list.get(i2)).longValue();
/* 147 */                   zzqvVar2.zzv((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
/* 150 */                   i2++;
                        }
/* 181 */               return;
                    }
/* 9 */             zzth zzthVar = (zzth) list;
/* 11 */            if (!z) {
/* 69 */                while (i2 < zzthVar.size()) {
/* 71 */                    zzqv zzqvVar3 = this.zza;
/* 73 */                    long jZze = zzthVar.zze(i2);
/* 81 */                    zzqvVar3.zzu(i, (jZze >> 63) ^ (jZze + jZze));
/* 84 */                    i2++;
                        }
/* 181 */               return;
                    }
/* 13 */            zzqv zzqvVar4 = this.zza;
/* 15 */            zzqvVar4.zzr(i, 2);
/* 19 */            int iZzB2 = 0;
/* 24 */            for (int i4 = 0; i4 < zzthVar.size(); i4++) {
/* 26 */                long jZze2 = zzthVar.zze(i4);
/* 38 */                iZzB2 += zzqv.zzB((jZze2 >> 63) ^ (jZze2 + jZze2));
                    }
/* 42 */            zzqvVar4.zzt(iZzB2);
/* 49 */            while (i2 < zzthVar.size()) {
/* 51 */                long jZze3 = zzthVar.zze(i2);
/* 59 */                zzqvVar4.zzv((jZze3 >> 63) ^ (jZze3 + jZze3));
/* 62 */                i2++;
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                @Deprecated
                public final void zzF(int i) throws IOException {
/* 4 */             this.zza.zzr(i, 3);
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                public final void zzG(int i, String str) throws IOException {
/* 3 */             this.zza.zzp(i, str);
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                public final void zzH(int i, List list) throws IOException {
/* 3 */             int i2 = 0;
/* 4 */             if (!(list instanceof zzte)) {
/* 43 */                while (i2 < list.size()) {
/* 53 */                    this.zza.zzp(i, (String) list.get(i2));
/* 56 */                    i2++;
                        }
/* 59 */                return;
                    }
/* 7 */             zzte zzteVar = (zzte) list;
/* 13 */            while (i2 < list.size()) {
/* 15 */                Object objZzc = zzteVar.zzc();
/* 19 */                boolean z = objZzc instanceof String;
/* 21 */                zzqv zzqvVar = this.zza;
/* 23 */                if (z) {
/* 27 */                    zzqvVar.zzp(i, (String) objZzc);
                        } else {
/* 33 */                    zzqvVar.zze(i, (zzqm) objZzc);
                        }
/* 36 */                i2++;
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                public final void zzI(int i, int i2) throws IOException {
/* 3 */             this.zza.zzs(i, i2);
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                public final void zzJ(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzso)) {
/* 73 */                if (!z) {
/* 135 */                   while (i2 < list.size()) {
/* 149 */                       this.zza.zzs(i, ((Integer) list.get(i2)).intValue());
/* 152 */                       i2++;
                            }
/* 155 */                   return;
                        }
/* 75 */                zzqv zzqvVar = this.zza;
/* 77 */                zzqvVar.zzr(i, 2);
/* 81 */                int iZzA = 0;
/* 86 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 102 */                   iZzA += zzqv.zzA(((Integer) list.get(i3)).intValue());
                        }
/* 106 */               zzqvVar.zzt(iZzA);
/* 113 */               while (i2 < list.size()) {
/* 125 */                   zzqvVar.zzt(((Integer) list.get(i2)).intValue());
/* 128 */                   i2++;
                        }
/* 155 */               return;
                    }
/* 7 */             zzso zzsoVar = (zzso) list;
/* 9 */             if (!z) {
/* 59 */                while (i2 < zzsoVar.size()) {
/* 67 */                    this.zza.zzs(i, zzsoVar.zze(i2));
/* 70 */                    i2++;
                        }
/* 155 */               return;
                    }
/* 11 */            zzqv zzqvVar2 = this.zza;
/* 13 */            zzqvVar2.zzr(i, 2);
/* 17 */            int iZzA2 = 0;
/* 22 */            for (int i4 = 0; i4 < zzsoVar.size(); i4++) {
/* 32 */                iZzA2 += zzqv.zzA(zzsoVar.zze(i4));
                    }
/* 36 */            zzqvVar2.zzt(iZzA2);
/* 43 */            while (i2 < zzsoVar.size()) {
/* 49 */                zzqvVar2.zzt(zzsoVar.zze(i2));
/* 52 */                i2++;
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                public final void zzK(int i, long j) throws IOException {
/* 3 */             this.zza.zzu(i, j);
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                public final void zzL(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzth)) {
/* 73 */                if (!z) {
/* 135 */                   while (i2 < list.size()) {
/* 149 */                       this.zza.zzu(i, ((Long) list.get(i2)).longValue());
/* 152 */                       i2++;
                            }
/* 155 */                   return;
                        }
/* 75 */                zzqv zzqvVar = this.zza;
/* 77 */                zzqvVar.zzr(i, 2);
/* 81 */                int iZzB = 0;
/* 86 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 102 */                   iZzB += zzqv.zzB(((Long) list.get(i3)).longValue());
                        }
/* 106 */               zzqvVar.zzt(iZzB);
/* 113 */               while (i2 < list.size()) {
/* 125 */                   zzqvVar.zzv(((Long) list.get(i2)).longValue());
/* 128 */                   i2++;
                        }
/* 155 */               return;
                    }
/* 7 */             zzth zzthVar = (zzth) list;
/* 9 */             if (!z) {
/* 59 */                while (i2 < zzthVar.size()) {
/* 67 */                    this.zza.zzu(i, zzthVar.zze(i2));
/* 70 */                    i2++;
                        }
/* 155 */               return;
                    }
/* 11 */            zzqv zzqvVar2 = this.zza;
/* 13 */            zzqvVar2.zzr(i, 2);
/* 17 */            int iZzB2 = 0;
/* 22 */            for (int i4 = 0; i4 < zzthVar.size(); i4++) {
/* 32 */                iZzB2 += zzqv.zzB(zzthVar.zze(i4));
                    }
/* 36 */            zzqvVar2.zzt(iZzB2);
/* 43 */            while (i2 < zzthVar.size()) {
/* 49 */                zzqvVar2.zzv(zzthVar.zze(i2));
/* 52 */                i2++;
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                public final void zzb(int i, boolean z) throws IOException {
/* 3 */             this.zza.zzd(i, z);
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // com.google.android.recaptcha.internal.zzvi
                public final void zzc(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzqd)) {
/* 69 */                if (!z) {
/* 127 */                   while (i2 < list.size()) {
/* 141 */                       this.zza.zzd(i, ((Boolean) list.get(i2)).booleanValue());
/* 144 */                       i2++;
                            }
/* 147 */                   return;
                        }
/* 71 */                zzqv zzqvVar = this.zza;
/* 73 */                zzqvVar.zzr(i, 2);
/* 77 */                int i3 = 0;
/* 82 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 90 */                    ((Boolean) list.get(i4)).getClass();
/* 93 */                    i3++;
                        }
/* 98 */                zzqvVar.zzt(i3);
/* 105 */               while (i2 < list.size()) {
/* 117 */                   zzqvVar.zzb(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
/* 120 */                   i2++;
                        }
/* 147 */               return;
                    }
/* 7 */             zzqd zzqdVar = (zzqd) list;
/* 9 */             if (!z) {
/* 55 */                while (i2 < zzqdVar.size()) {
/* 63 */                    this.zza.zzd(i, zzqdVar.zzf(i2));
/* 66 */                    i2++;
                        }
/* 147 */               return;
                    }
/* 11 */            zzqv zzqvVar2 = this.zza;
/* 13 */            zzqvVar2.zzr(i, 2);
/* 17 */            int i5 = 0;
/* 22 */            for (int i6 = 0; i6 < zzqdVar.size(); i6++) {
/* 24 */                zzqdVar.zzf(i6);
/* 27 */                i5++;
                    }
/* 32 */            zzqvVar2.zzt(i5);
/* 39 */            while (i2 < zzqdVar.size()) {
/* 45 */                zzqvVar2.zzb(zzqdVar.zzf(i2) ? (byte) 1 : (byte) 0);
/* 48 */                i2++;
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                public final void zzd(int i, zzqm zzqmVar) throws IOException {
/* 3 */             this.zza.zze(i, zzqmVar);
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                public final void zze(int i, List list) throws IOException {
/* 6 */             for (int i2 = 0; i2 < list.size(); i2++) {
/* 16 */                this.zza.zze(i, (zzqm) list.get(i2));
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                public final void zzf(int i, double d) throws IOException {
/* 7 */             this.zza.zzh(i, Double.doubleToRawLongBits(d));
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                public final void zzg(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzrs)) {
/* 77 */                if (!z) {
/* 139 */                   while (i2 < list.size()) {
/* 157 */                       this.zza.zzh(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
/* 160 */                       i2++;
                            }
/* 163 */                   return;
                        }
/* 79 */                zzqv zzqvVar = this.zza;
/* 81 */                zzqvVar.zzr(i, 2);
/* 85 */                int i3 = 0;
/* 90 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 98 */                    ((Double) list.get(i4)).getClass();
/* 101 */                   i3 += 8;
                        }
/* 106 */               zzqvVar.zzt(i3);
/* 113 */               while (i2 < list.size()) {
/* 129 */                   zzqvVar.zzi(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
/* 132 */                   i2++;
                        }
/* 163 */               return;
                    }
/* 7 */             zzrs zzrsVar = (zzrs) list;
/* 9 */             if (!z) {
/* 59 */                while (i2 < zzrsVar.size()) {
/* 71 */                    this.zza.zzh(i, Double.doubleToRawLongBits(zzrsVar.zze(i2)));
/* 74 */                    i2++;
                        }
/* 163 */               return;
                    }
/* 11 */            zzqv zzqvVar2 = this.zza;
/* 13 */            zzqvVar2.zzr(i, 2);
/* 17 */            int i5 = 0;
/* 22 */            for (int i6 = 0; i6 < zzrsVar.size(); i6++) {
/* 24 */                zzrsVar.zze(i6);
/* 27 */                i5 += 8;
                    }
/* 32 */            zzqvVar2.zzt(i5);
/* 39 */            while (i2 < zzrsVar.size()) {
/* 49 */                zzqvVar2.zzi(Double.doubleToRawLongBits(zzrsVar.zze(i2)));
/* 52 */                i2++;
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                @Deprecated
                public final void zzh(int i) throws IOException {
/* 4 */             this.zza.zzr(i, 4);
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                public final void zzi(int i, int i2) throws IOException {
/* 3 */             this.zza.zzj(i, i2);
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                public final void zzj(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzso)) {
/* 74 */                if (!z) {
/* 137 */                   while (i2 < list.size()) {
/* 151 */                       this.zza.zzj(i, ((Integer) list.get(i2)).intValue());
/* 154 */                       i2++;
                            }
/* 157 */                   return;
                        }
/* 76 */                zzqv zzqvVar = this.zza;
/* 78 */                zzqvVar.zzr(i, 2);
/* 82 */                int iZzB = 0;
/* 87 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 104 */                   iZzB += zzqv.zzB(((Integer) list.get(i3)).intValue());
                        }
/* 108 */               zzqvVar.zzt(iZzB);
/* 115 */               while (i2 < list.size()) {
/* 127 */                   zzqvVar.zzk(((Integer) list.get(i2)).intValue());
/* 130 */                   i2++;
                        }
/* 157 */               return;
                    }
/* 7 */             zzso zzsoVar = (zzso) list;
/* 9 */             if (!z) {
/* 60 */                while (i2 < zzsoVar.size()) {
/* 68 */                    this.zza.zzj(i, zzsoVar.zze(i2));
/* 71 */                    i2++;
                        }
/* 157 */               return;
                    }
/* 11 */            zzqv zzqvVar2 = this.zza;
/* 13 */            zzqvVar2.zzr(i, 2);
/* 17 */            int iZzB2 = 0;
/* 22 */            for (int i4 = 0; i4 < zzsoVar.size(); i4++) {
/* 33 */                iZzB2 += zzqv.zzB(zzsoVar.zze(i4));
                    }
/* 37 */            zzqvVar2.zzt(iZzB2);
/* 44 */            while (i2 < zzsoVar.size()) {
/* 50 */                zzqvVar2.zzk(zzsoVar.zze(i2));
/* 53 */                i2++;
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                public final void zzk(int i, int i2) throws IOException {
/* 3 */             this.zza.zzf(i, i2);
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                public final void zzl(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzso)) {
/* 69 */                if (!z) {
/* 127 */                   while (i2 < list.size()) {
/* 141 */                       this.zza.zzf(i, ((Integer) list.get(i2)).intValue());
/* 144 */                       i2++;
                            }
/* 147 */                   return;
                        }
/* 71 */                zzqv zzqvVar = this.zza;
/* 73 */                zzqvVar.zzr(i, 2);
/* 77 */                int i3 = 0;
/* 82 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 90 */                    ((Integer) list.get(i4)).getClass();
/* 93 */                    i3 += 4;
                        }
/* 98 */                zzqvVar.zzt(i3);
/* 105 */               while (i2 < list.size()) {
/* 117 */                   zzqvVar.zzg(((Integer) list.get(i2)).intValue());
/* 120 */                   i2++;
                        }
/* 147 */               return;
                    }
/* 7 */             zzso zzsoVar = (zzso) list;
/* 9 */             if (!z) {
/* 55 */                while (i2 < zzsoVar.size()) {
/* 63 */                    this.zza.zzf(i, zzsoVar.zze(i2));
/* 66 */                    i2++;
                        }
/* 147 */               return;
                    }
/* 11 */            zzqv zzqvVar2 = this.zza;
/* 13 */            zzqvVar2.zzr(i, 2);
/* 17 */            int i5 = 0;
/* 22 */            for (int i6 = 0; i6 < zzsoVar.size(); i6++) {
/* 24 */                zzsoVar.zze(i6);
/* 27 */                i5 += 4;
                    }
/* 32 */            zzqvVar2.zzt(i5);
/* 39 */            while (i2 < zzsoVar.size()) {
/* 45 */                zzqvVar2.zzg(zzsoVar.zze(i2));
/* 48 */                i2++;
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                public final void zzm(int i, long j) throws IOException {
/* 3 */             this.zza.zzh(i, j);
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                public final void zzn(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzth)) {
/* 69 */                if (!z) {
/* 127 */                   while (i2 < list.size()) {
/* 141 */                       this.zza.zzh(i, ((Long) list.get(i2)).longValue());
/* 144 */                       i2++;
                            }
/* 147 */                   return;
                        }
/* 71 */                zzqv zzqvVar = this.zza;
/* 73 */                zzqvVar.zzr(i, 2);
/* 77 */                int i3 = 0;
/* 82 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 90 */                    ((Long) list.get(i4)).getClass();
/* 93 */                    i3 += 8;
                        }
/* 98 */                zzqvVar.zzt(i3);
/* 105 */               while (i2 < list.size()) {
/* 117 */                   zzqvVar.zzi(((Long) list.get(i2)).longValue());
/* 120 */                   i2++;
                        }
/* 147 */               return;
                    }
/* 7 */             zzth zzthVar = (zzth) list;
/* 9 */             if (!z) {
/* 55 */                while (i2 < zzthVar.size()) {
/* 63 */                    this.zza.zzh(i, zzthVar.zze(i2));
/* 66 */                    i2++;
                        }
/* 147 */               return;
                    }
/* 11 */            zzqv zzqvVar2 = this.zza;
/* 13 */            zzqvVar2.zzr(i, 2);
/* 17 */            int i5 = 0;
/* 22 */            for (int i6 = 0; i6 < zzthVar.size(); i6++) {
/* 24 */                zzthVar.zze(i6);
/* 27 */                i5 += 8;
                    }
/* 32 */            zzqvVar2.zzt(i5);
/* 39 */            while (i2 < zzthVar.size()) {
/* 45 */                zzqvVar2.zzi(zzthVar.zze(i2));
/* 48 */                i2++;
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                public final void zzo(int i, float f) throws IOException {
/* 7 */             this.zza.zzf(i, Float.floatToRawIntBits(f));
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                public final void zzp(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzsf)) {
/* 77 */                if (!z) {
/* 139 */                   while (i2 < list.size()) {
/* 157 */                       this.zza.zzf(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
/* 160 */                       i2++;
                            }
/* 163 */                   return;
                        }
/* 79 */                zzqv zzqvVar = this.zza;
/* 81 */                zzqvVar.zzr(i, 2);
/* 85 */                int i3 = 0;
/* 90 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 98 */                    ((Float) list.get(i4)).getClass();
/* 101 */                   i3 += 4;
                        }
/* 106 */               zzqvVar.zzt(i3);
/* 113 */               while (i2 < list.size()) {
/* 129 */                   zzqvVar.zzg(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
/* 132 */                   i2++;
                        }
/* 163 */               return;
                    }
/* 7 */             zzsf zzsfVar = (zzsf) list;
/* 9 */             if (!z) {
/* 59 */                while (i2 < zzsfVar.size()) {
/* 71 */                    this.zza.zzf(i, Float.floatToRawIntBits(zzsfVar.zze(i2)));
/* 74 */                    i2++;
                        }
/* 163 */               return;
                    }
/* 11 */            zzqv zzqvVar2 = this.zza;
/* 13 */            zzqvVar2.zzr(i, 2);
/* 17 */            int i5 = 0;
/* 22 */            for (int i6 = 0; i6 < zzsfVar.size(); i6++) {
/* 24 */                zzsfVar.zze(i6);
/* 27 */                i5 += 4;
                    }
/* 32 */            zzqvVar2.zzt(i5);
/* 39 */            while (i2 < zzsfVar.size()) {
/* 49 */                zzqvVar2.zzg(Float.floatToRawIntBits(zzsfVar.zze(i2)));
/* 52 */                i2++;
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                public final void zzq(int i, Object obj, zzug zzugVar) throws IOException {
/* 3 */             zzqv zzqvVar = this.zza;
/* 6 */             zzqvVar.zzr(i, 3);
/* 11 */            zzugVar.zzj((zzts) obj, zzqvVar.zza);
/* 15 */            zzqvVar.zzr(i, 4);
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                public final void zzr(int i, int i2) throws IOException {
/* 3 */             this.zza.zzj(i, i2);
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                public final void zzs(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzso)) {
/* 74 */                if (!z) {
/* 137 */                   while (i2 < list.size()) {
/* 151 */                       this.zza.zzj(i, ((Integer) list.get(i2)).intValue());
/* 154 */                       i2++;
                            }
/* 157 */                   return;
                        }
/* 76 */                zzqv zzqvVar = this.zza;
/* 78 */                zzqvVar.zzr(i, 2);
/* 82 */                int iZzB = 0;
/* 87 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 104 */                   iZzB += zzqv.zzB(((Integer) list.get(i3)).intValue());
                        }
/* 108 */               zzqvVar.zzt(iZzB);
/* 115 */               while (i2 < list.size()) {
/* 127 */                   zzqvVar.zzk(((Integer) list.get(i2)).intValue());
/* 130 */                   i2++;
                        }
/* 157 */               return;
                    }
/* 7 */             zzso zzsoVar = (zzso) list;
/* 9 */             if (!z) {
/* 60 */                while (i2 < zzsoVar.size()) {
/* 68 */                    this.zza.zzj(i, zzsoVar.zze(i2));
/* 71 */                    i2++;
                        }
/* 157 */               return;
                    }
/* 11 */            zzqv zzqvVar2 = this.zza;
/* 13 */            zzqvVar2.zzr(i, 2);
/* 17 */            int iZzB2 = 0;
/* 22 */            for (int i4 = 0; i4 < zzsoVar.size(); i4++) {
/* 33 */                iZzB2 += zzqv.zzB(zzsoVar.zze(i4));
                    }
/* 37 */            zzqvVar2.zzt(iZzB2);
/* 44 */            while (i2 < zzsoVar.size()) {
/* 50 */                zzqvVar2.zzk(zzsoVar.zze(i2));
/* 53 */                i2++;
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                public final void zzt(int i, long j) throws IOException {
/* 3 */             this.zza.zzu(i, j);
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                public final void zzu(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzth)) {
/* 73 */                if (!z) {
/* 135 */                   while (i2 < list.size()) {
/* 149 */                       this.zza.zzu(i, ((Long) list.get(i2)).longValue());
/* 152 */                       i2++;
                            }
/* 155 */                   return;
                        }
/* 75 */                zzqv zzqvVar = this.zza;
/* 77 */                zzqvVar.zzr(i, 2);
/* 81 */                int iZzB = 0;
/* 86 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 102 */                   iZzB += zzqv.zzB(((Long) list.get(i3)).longValue());
                        }
/* 106 */               zzqvVar.zzt(iZzB);
/* 113 */               while (i2 < list.size()) {
/* 125 */                   zzqvVar.zzv(((Long) list.get(i2)).longValue());
/* 128 */                   i2++;
                        }
/* 155 */               return;
                    }
/* 7 */             zzth zzthVar = (zzth) list;
/* 9 */             if (!z) {
/* 59 */                while (i2 < zzthVar.size()) {
/* 67 */                    this.zza.zzu(i, zzthVar.zze(i2));
/* 70 */                    i2++;
                        }
/* 155 */               return;
                    }
/* 11 */            zzqv zzqvVar2 = this.zza;
/* 13 */            zzqvVar2.zzr(i, 2);
/* 17 */            int iZzB2 = 0;
/* 22 */            for (int i4 = 0; i4 < zzthVar.size(); i4++) {
/* 32 */                iZzB2 += zzqv.zzB(zzthVar.zze(i4));
                    }
/* 36 */            zzqvVar2.zzt(iZzB2);
/* 43 */            while (i2 < zzthVar.size()) {
/* 49 */                zzqvVar2.zzv(zzthVar.zze(i2));
/* 52 */                i2++;
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                public final void zzv(int i, Object obj, zzug zzugVar) throws IOException {
/* 5 */             this.zza.zzm(i, (zzts) obj, zzugVar);
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                public final void zzw(int i, Object obj) throws IOException {
/* 1 */             boolean z = obj instanceof zzqm;
/* 3 */             zzqv zzqvVar = this.zza;
/* 5 */             if (z) {
/* 9 */                 zzqvVar.zzo(i, (zzqm) obj);
                    } else {
/* 15 */                zzqvVar.zzn(i, (zzts) obj);
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                public final void zzx(int i, int i2) throws IOException {
/* 3 */             this.zza.zzf(i, i2);
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                public final void zzy(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzso)) {
/* 69 */                if (!z) {
/* 127 */                   while (i2 < list.size()) {
/* 141 */                       this.zza.zzf(i, ((Integer) list.get(i2)).intValue());
/* 144 */                       i2++;
                            }
/* 147 */                   return;
                        }
/* 71 */                zzqv zzqvVar = this.zza;
/* 73 */                zzqvVar.zzr(i, 2);
/* 77 */                int i3 = 0;
/* 82 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 90 */                    ((Integer) list.get(i4)).getClass();
/* 93 */                    i3 += 4;
                        }
/* 98 */                zzqvVar.zzt(i3);
/* 105 */               while (i2 < list.size()) {
/* 117 */                   zzqvVar.zzg(((Integer) list.get(i2)).intValue());
/* 120 */                   i2++;
                        }
/* 147 */               return;
                    }
/* 7 */             zzso zzsoVar = (zzso) list;
/* 9 */             if (!z) {
/* 55 */                while (i2 < zzsoVar.size()) {
/* 63 */                    this.zza.zzf(i, zzsoVar.zze(i2));
/* 66 */                    i2++;
                        }
/* 147 */               return;
                    }
/* 11 */            zzqv zzqvVar2 = this.zza;
/* 13 */            zzqvVar2.zzr(i, 2);
/* 17 */            int i5 = 0;
/* 22 */            for (int i6 = 0; i6 < zzsoVar.size(); i6++) {
/* 24 */                zzsoVar.zze(i6);
/* 27 */                i5 += 4;
                    }
/* 32 */            zzqvVar2.zzt(i5);
/* 39 */            while (i2 < zzsoVar.size()) {
/* 45 */                zzqvVar2.zzg(zzsoVar.zze(i2));
/* 48 */                i2++;
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzvi
                public final void zzz(int i, long j) throws IOException {
/* 3 */             this.zza.zzh(i, j);
                }
            }
