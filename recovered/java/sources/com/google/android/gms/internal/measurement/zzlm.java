            package com.google.android.gms.internal.measurement;

            import java.io.IOException;
            import java.util.List;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzlm implements zzou {
                private final zzll zza;

                private zzlm(zzll zzllVar) {
/* 4 */             byte[] bArr = zzmo.zzb;
/* 6 */             this.zza = zzllVar;
/* 8 */             zzllVar.zza = this;
                }

                public static zzlm zza(zzll zzllVar) {
/* 1 */             zzlm zzlmVar = zzllVar.zza;
                    return zzlmVar != null ? zzlmVar : new zzlm(zzllVar);
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zzA(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzmz)) {
/* 69 */                if (!z) {
/* 127 */                   while (i2 < list.size()) {
/* 141 */                       this.zza.zzf(i, ((Long) list.get(i2)).longValue());
/* 144 */                       i2++;
                            }
/* 147 */                   return;
                        }
/* 71 */                zzll zzllVar = this.zza;
/* 73 */                zzllVar.zza(i, 2);
/* 77 */                int i3 = 0;
/* 82 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 90 */                    ((Long) list.get(i4)).getClass();
/* 93 */                    i3 += 8;
                        }
/* 98 */                zzllVar.zzr(i3);
/* 105 */               while (i2 < list.size()) {
/* 117 */                   zzllVar.zzu(((Long) list.get(i2)).longValue());
/* 120 */                   i2++;
                        }
/* 147 */               return;
                    }
/* 7 */             zzmz zzmzVar = (zzmz) list;
/* 9 */             if (!z) {
/* 55 */                while (i2 < zzmzVar.size()) {
/* 63 */                    this.zza.zzf(i, zzmzVar.zzc(i2));
/* 66 */                    i2++;
                        }
/* 147 */               return;
                    }
/* 11 */            zzll zzllVar2 = this.zza;
/* 13 */            zzllVar2.zza(i, 2);
/* 17 */            int i5 = 0;
/* 22 */            for (int i6 = 0; i6 < zzmzVar.size(); i6++) {
/* 24 */                zzmzVar.zzc(i6);
/* 27 */                i5 += 8;
                    }
/* 32 */            zzllVar2.zzr(i5);
/* 39 */            while (i2 < zzmzVar.size()) {
/* 45 */                zzllVar2.zzu(zzmzVar.zzc(i2));
/* 48 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zzB(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzlx)) {
/* 77 */                if (!z) {
/* 139 */                   while (i2 < list.size()) {
/* 157 */                       this.zza.zzd(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
/* 160 */                       i2++;
                            }
/* 163 */                   return;
                        }
/* 79 */                zzll zzllVar = this.zza;
/* 81 */                zzllVar.zza(i, 2);
/* 85 */                int i3 = 0;
/* 90 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 98 */                    ((Float) list.get(i4)).getClass();
/* 101 */                   i3 += 4;
                        }
/* 106 */               zzllVar.zzr(i3);
/* 113 */               while (i2 < list.size()) {
/* 129 */                   zzllVar.zzs(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
/* 132 */                   i2++;
                        }
/* 163 */               return;
                    }
/* 7 */             zzlx zzlxVar = (zzlx) list;
/* 9 */             if (!z) {
/* 59 */                while (i2 < zzlxVar.size()) {
/* 71 */                    this.zza.zzd(i, Float.floatToRawIntBits(zzlxVar.zze(i2)));
/* 74 */                    i2++;
                        }
/* 163 */               return;
                    }
/* 11 */            zzll zzllVar2 = this.zza;
/* 13 */            zzllVar2.zza(i, 2);
/* 17 */            int i5 = 0;
/* 22 */            for (int i6 = 0; i6 < zzlxVar.size(); i6++) {
/* 24 */                zzlxVar.zze(i6);
/* 27 */                i5 += 4;
                    }
/* 32 */            zzllVar2.zzr(i5);
/* 39 */            while (i2 < zzlxVar.size()) {
/* 49 */                zzllVar2.zzs(Float.floatToRawIntBits(zzlxVar.zze(i2)));
/* 52 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zzC(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzln)) {
/* 77 */                if (!z) {
/* 139 */                   while (i2 < list.size()) {
/* 157 */                       this.zza.zzf(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
/* 160 */                       i2++;
                            }
/* 163 */                   return;
                        }
/* 79 */                zzll zzllVar = this.zza;
/* 81 */                zzllVar.zza(i, 2);
/* 85 */                int i3 = 0;
/* 90 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 98 */                    ((Double) list.get(i4)).getClass();
/* 101 */                   i3 += 8;
                        }
/* 106 */               zzllVar.zzr(i3);
/* 113 */               while (i2 < list.size()) {
/* 129 */                   zzllVar.zzu(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
/* 132 */                   i2++;
                        }
/* 163 */               return;
                    }
/* 7 */             zzln zzlnVar = (zzln) list;
/* 9 */             if (!z) {
/* 59 */                while (i2 < zzlnVar.size()) {
/* 71 */                    this.zza.zzf(i, Double.doubleToRawLongBits(zzlnVar.zze(i2)));
/* 74 */                    i2++;
                        }
/* 163 */               return;
                    }
/* 11 */            zzll zzllVar2 = this.zza;
/* 13 */            zzllVar2.zza(i, 2);
/* 17 */            int i5 = 0;
/* 22 */            for (int i6 = 0; i6 < zzlnVar.size(); i6++) {
/* 24 */                zzlnVar.zze(i6);
/* 27 */                i5 += 8;
                    }
/* 32 */            zzllVar2.zzr(i5);
/* 39 */            while (i2 < zzlnVar.size()) {
/* 49 */                zzllVar2.zzu(Double.doubleToRawLongBits(zzlnVar.zze(i2)));
/* 52 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zzD(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzmf)) {
/* 74 */                if (!z) {
/* 137 */                   while (i2 < list.size()) {
/* 151 */                       this.zza.zzb(i, ((Integer) list.get(i2)).intValue());
/* 154 */                       i2++;
                            }
/* 157 */                   return;
                        }
/* 76 */                zzll zzllVar = this.zza;
/* 78 */                zzllVar.zza(i, 2);
/* 82 */                int iZzA = 0;
/* 87 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 104 */                   iZzA += zzll.zzA(((Integer) list.get(i3)).intValue());
                        }
/* 108 */               zzllVar.zzr(iZzA);
/* 115 */               while (i2 < list.size()) {
/* 127 */                   zzllVar.zzq(((Integer) list.get(i2)).intValue());
/* 130 */                   i2++;
                        }
/* 157 */               return;
                    }
/* 7 */             zzmf zzmfVar = (zzmf) list;
/* 9 */             if (!z) {
/* 60 */                while (i2 < zzmfVar.size()) {
/* 68 */                    this.zza.zzb(i, zzmfVar.zzf(i2));
/* 71 */                    i2++;
                        }
/* 157 */               return;
                    }
/* 11 */            zzll zzllVar2 = this.zza;
/* 13 */            zzllVar2.zza(i, 2);
/* 17 */            int iZzA2 = 0;
/* 22 */            for (int i4 = 0; i4 < zzmfVar.size(); i4++) {
/* 33 */                iZzA2 += zzll.zzA(zzmfVar.zzf(i4));
                    }
/* 37 */            zzllVar2.zzr(iZzA2);
/* 44 */            while (i2 < zzmfVar.size()) {
/* 50 */                zzllVar2.zzq(zzmfVar.zzf(i2));
/* 53 */                i2++;
                    }
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
                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zzE(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzkx)) {
/* 69 */                if (!z) {
/* 127 */                   while (i2 < list.size()) {
/* 141 */                       this.zza.zzg(i, ((Boolean) list.get(i2)).booleanValue());
/* 144 */                       i2++;
                            }
/* 147 */                   return;
                        }
/* 71 */                zzll zzllVar = this.zza;
/* 73 */                zzllVar.zza(i, 2);
/* 77 */                int i3 = 0;
/* 82 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 90 */                    ((Boolean) list.get(i4)).getClass();
/* 93 */                    i3++;
                        }
/* 98 */                zzllVar.zzr(i3);
/* 105 */               while (i2 < list.size()) {
/* 117 */                   zzllVar.zzp(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
/* 120 */                   i2++;
                        }
/* 147 */               return;
                    }
/* 7 */             zzkx zzkxVar = (zzkx) list;
/* 9 */             if (!z) {
/* 55 */                while (i2 < zzkxVar.size()) {
/* 63 */                    this.zza.zzg(i, zzkxVar.zze(i2));
/* 66 */                    i2++;
                        }
/* 147 */               return;
                    }
/* 11 */            zzll zzllVar2 = this.zza;
/* 13 */            zzllVar2.zza(i, 2);
/* 17 */            int i5 = 0;
/* 22 */            for (int i6 = 0; i6 < zzkxVar.size(); i6++) {
/* 24 */                zzkxVar.zze(i6);
/* 27 */                i5++;
                    }
/* 32 */            zzllVar2.zzr(i5);
/* 39 */            while (i2 < zzkxVar.size()) {
/* 45 */                zzllVar2.zzp(zzkxVar.zze(i2) ? (byte) 1 : (byte) 0);
/* 48 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zzF(int i, List list) throws IOException {
/* 3 */             int i2 = 0;
/* 4 */             if (!(list instanceof zzmw)) {
/* 43 */                while (i2 < list.size()) {
/* 53 */                    this.zza.zzh(i, (String) list.get(i2));
/* 56 */                    i2++;
                        }
/* 59 */                return;
                    }
/* 7 */             zzmw zzmwVar = (zzmw) list;
/* 13 */            while (i2 < list.size()) {
/* 15 */                Object objZzc = zzmwVar.zzc();
/* 19 */                boolean z = objZzc instanceof String;
/* 21 */                zzll zzllVar = this.zza;
/* 23 */                if (z) {
/* 27 */                    zzllVar.zzh(i, (String) objZzc);
                        } else {
/* 33 */                    zzllVar.zzi(i, (zzlg) objZzc);
                        }
/* 36 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zzG(int i, List list) throws IOException {
/* 6 */             for (int i2 = 0; i2 < list.size(); i2++) {
/* 16 */                this.zza.zzi(i, (zzlg) list.get(i2));
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zzH(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzmf)) {
/* 73 */                if (!z) {
/* 135 */                   while (i2 < list.size()) {
/* 149 */                       this.zza.zzc(i, ((Integer) list.get(i2)).intValue());
/* 152 */                       i2++;
                            }
/* 155 */                   return;
                        }
/* 75 */                zzll zzllVar = this.zza;
/* 77 */                zzllVar.zza(i, 2);
/* 81 */                int iZzz = 0;
/* 86 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 102 */                   iZzz += zzll.zzz(((Integer) list.get(i3)).intValue());
                        }
/* 106 */               zzllVar.zzr(iZzz);
/* 113 */               while (i2 < list.size()) {
/* 125 */                   zzllVar.zzr(((Integer) list.get(i2)).intValue());
/* 128 */                   i2++;
                        }
/* 155 */               return;
                    }
/* 7 */             zzmf zzmfVar = (zzmf) list;
/* 9 */             if (!z) {
/* 59 */                while (i2 < zzmfVar.size()) {
/* 67 */                    this.zza.zzc(i, zzmfVar.zzf(i2));
/* 70 */                    i2++;
                        }
/* 155 */               return;
                    }
/* 11 */            zzll zzllVar2 = this.zza;
/* 13 */            zzllVar2.zza(i, 2);
/* 17 */            int iZzz2 = 0;
/* 22 */            for (int i4 = 0; i4 < zzmfVar.size(); i4++) {
/* 32 */                iZzz2 += zzll.zzz(zzmfVar.zzf(i4));
                    }
/* 36 */            zzllVar2.zzr(iZzz2);
/* 43 */            while (i2 < zzmfVar.size()) {
/* 49 */                zzllVar2.zzr(zzmfVar.zzf(i2));
/* 52 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zzI(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzmf)) {
/* 69 */                if (!z) {
/* 127 */                   while (i2 < list.size()) {
/* 141 */                       this.zza.zzd(i, ((Integer) list.get(i2)).intValue());
/* 144 */                       i2++;
                            }
/* 147 */                   return;
                        }
/* 71 */                zzll zzllVar = this.zza;
/* 73 */                zzllVar.zza(i, 2);
/* 77 */                int i3 = 0;
/* 82 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 90 */                    ((Integer) list.get(i4)).getClass();
/* 93 */                    i3 += 4;
                        }
/* 98 */                zzllVar.zzr(i3);
/* 105 */               while (i2 < list.size()) {
/* 117 */                   zzllVar.zzs(((Integer) list.get(i2)).intValue());
/* 120 */                   i2++;
                        }
/* 147 */               return;
                    }
/* 7 */             zzmf zzmfVar = (zzmf) list;
/* 9 */             if (!z) {
/* 55 */                while (i2 < zzmfVar.size()) {
/* 63 */                    this.zza.zzd(i, zzmfVar.zzf(i2));
/* 66 */                    i2++;
                        }
/* 147 */               return;
                    }
/* 11 */            zzll zzllVar2 = this.zza;
/* 13 */            zzllVar2.zza(i, 2);
/* 17 */            int i5 = 0;
/* 22 */            for (int i6 = 0; i6 < zzmfVar.size(); i6++) {
/* 24 */                zzmfVar.zzf(i6);
/* 27 */                i5 += 4;
                    }
/* 32 */            zzllVar2.zzr(i5);
/* 39 */            while (i2 < zzmfVar.size()) {
/* 45 */                zzllVar2.zzs(zzmfVar.zzf(i2));
/* 48 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zzJ(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzmz)) {
/* 69 */                if (!z) {
/* 127 */                   while (i2 < list.size()) {
/* 141 */                       this.zza.zzf(i, ((Long) list.get(i2)).longValue());
/* 144 */                       i2++;
                            }
/* 147 */                   return;
                        }
/* 71 */                zzll zzllVar = this.zza;
/* 73 */                zzllVar.zza(i, 2);
/* 77 */                int i3 = 0;
/* 82 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 90 */                    ((Long) list.get(i4)).getClass();
/* 93 */                    i3 += 8;
                        }
/* 98 */                zzllVar.zzr(i3);
/* 105 */               while (i2 < list.size()) {
/* 117 */                   zzllVar.zzu(((Long) list.get(i2)).longValue());
/* 120 */                   i2++;
                        }
/* 147 */               return;
                    }
/* 7 */             zzmz zzmzVar = (zzmz) list;
/* 9 */             if (!z) {
/* 55 */                while (i2 < zzmzVar.size()) {
/* 63 */                    this.zza.zzf(i, zzmzVar.zzc(i2));
/* 66 */                    i2++;
                        }
/* 147 */               return;
                    }
/* 11 */            zzll zzllVar2 = this.zza;
/* 13 */            zzllVar2.zza(i, 2);
/* 17 */            int i5 = 0;
/* 22 */            for (int i6 = 0; i6 < zzmzVar.size(); i6++) {
/* 24 */                zzmzVar.zzc(i6);
/* 27 */                i5 += 8;
                    }
/* 32 */            zzllVar2.zzr(i5);
/* 39 */            while (i2 < zzmzVar.size()) {
/* 45 */                zzllVar2.zzu(zzmzVar.zzc(i2));
/* 48 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zzK(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzmf)) {
/* 88 */                if (!z) {
/* 160 */                   while (i2 < list.size()) {
/* 162 */                       zzll zzllVar = this.zza;
/* 170 */                       int iIntValue = ((Integer) list.get(i2)).intValue();
/* 179 */                       zzllVar.zzc(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
/* 182 */                       i2++;
                            }
/* 185 */                   return;
                        }
/* 90 */                zzll zzllVar2 = this.zza;
/* 92 */                zzllVar2.zza(i, 2);
/* 96 */                int iZzz = 0;
/* 101 */               for (int i3 = 0; i3 < list.size(); i3++) {
/* 109 */                   int iIntValue2 = ((Integer) list.get(i3)).intValue();
/* 122 */                   iZzz += zzll.zzz((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
                        }
/* 126 */               zzllVar2.zzr(iZzz);
/* 133 */               while (i2 < list.size()) {
/* 141 */                   int iIntValue3 = ((Integer) list.get(i2)).intValue();
/* 150 */                   zzllVar2.zzr((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
/* 153 */                   i2++;
                        }
/* 185 */               return;
                    }
/* 7 */             zzmf zzmfVar = (zzmf) list;
/* 9 */             if (!z) {
/* 69 */                while (i2 < zzmfVar.size()) {
/* 71 */                    zzll zzllVar3 = this.zza;
/* 73 */                    int iZzf = zzmfVar.zzf(i2);
/* 82 */                    zzllVar3.zzc(i, (iZzf >> 31) ^ (iZzf + iZzf));
/* 85 */                    i2++;
                        }
/* 185 */               return;
                    }
/* 11 */            zzll zzllVar4 = this.zza;
/* 13 */            zzllVar4.zza(i, 2);
/* 17 */            int iZzz2 = 0;
/* 22 */            for (int i4 = 0; i4 < zzmfVar.size(); i4++) {
/* 24 */                int iZzf2 = zzmfVar.zzf(i4);
/* 37 */                iZzz2 += zzll.zzz((iZzf2 >> 31) ^ (iZzf2 + iZzf2));
                    }
/* 41 */            zzllVar4.zzr(iZzz2);
/* 48 */            while (i2 < zzmfVar.size()) {
/* 50 */                int iZzf3 = zzmfVar.zzf(i2);
/* 59 */                zzllVar4.zzr((iZzf3 >> 31) ^ (iZzf3 + iZzf3));
/* 62 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zzL(int i, List list, boolean z) throws IOException {
/* 6 */             int i2 = 0;
/* 7 */             if (!(list instanceof zzmz)) {
/* 87 */                if (!z) {
/* 157 */                   while (i2 < list.size()) {
/* 159 */                       zzll zzllVar = this.zza;
/* 167 */                       long jLongValue = ((Long) list.get(i2)).longValue();
/* 175 */                       zzllVar.zze(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
/* 178 */                       i2++;
                            }
/* 181 */                   return;
                        }
/* 89 */                zzll zzllVar2 = this.zza;
/* 91 */                zzllVar2.zza(i, 2);
/* 95 */                int iZzA = 0;
/* 100 */               for (int i3 = 0; i3 < list.size(); i3++) {
/* 108 */                   long jLongValue2 = ((Long) list.get(i3)).longValue();
/* 120 */                   iZzA += zzll.zzA((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
                        }
/* 124 */               zzllVar2.zzr(iZzA);
/* 131 */               while (i2 < list.size()) {
/* 139 */                   long jLongValue3 = ((Long) list.get(i2)).longValue();
/* 147 */                   zzllVar2.zzt((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
/* 150 */                   i2++;
                        }
/* 181 */               return;
                    }
/* 9 */             zzmz zzmzVar = (zzmz) list;
/* 11 */            if (!z) {
/* 69 */                while (i2 < zzmzVar.size()) {
/* 71 */                    zzll zzllVar3 = this.zza;
/* 73 */                    long jZzc = zzmzVar.zzc(i2);
/* 81 */                    zzllVar3.zze(i, (jZzc >> 63) ^ (jZzc + jZzc));
/* 84 */                    i2++;
                        }
/* 181 */               return;
                    }
/* 13 */            zzll zzllVar4 = this.zza;
/* 15 */            zzllVar4.zza(i, 2);
/* 19 */            int iZzA2 = 0;
/* 24 */            for (int i4 = 0; i4 < zzmzVar.size(); i4++) {
/* 26 */                long jZzc2 = zzmzVar.zzc(i4);
/* 38 */                iZzA2 += zzll.zzA((jZzc2 >> 63) ^ (jZzc2 + jZzc2));
                    }
/* 42 */            zzllVar4.zzr(iZzA2);
/* 49 */            while (i2 < zzmzVar.size()) {
/* 51 */                long jZzc3 = zzmzVar.zzc(i2);
/* 59 */                zzllVar4.zzt((jZzc3 >> 63) ^ (jZzc3 + jZzc3));
/* 62 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zzM(int i, zznd zzndVar, Map map) throws IOException {
/* 13 */            for (Map.Entry entry : map.entrySet()) {
/* 21 */                zzll zzllVar = this.zza;
/* 24 */                zzllVar.zza(i, 2);
/* 39 */                zzllVar.zzr(zzne.zzc(zzndVar, entry.getKey(), entry.getValue()));
/* 50 */                zzne.zzb(zzllVar, zzndVar, entry.getKey(), entry.getValue());
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zzb(int i, int i2) throws IOException {
/* 3 */             this.zza.zzd(i, i2);
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zzc(int i, long j) throws IOException {
/* 3 */             this.zza.zze(i, j);
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zzd(int i, long j) throws IOException {
/* 3 */             this.zza.zzf(i, j);
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zze(int i, float f) throws IOException {
/* 7 */             this.zza.zzd(i, Float.floatToRawIntBits(f));
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zzf(int i, double d) throws IOException {
/* 7 */             this.zza.zzf(i, Double.doubleToRawLongBits(d));
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zzg(int i, int i2) throws IOException {
/* 3 */             this.zza.zzb(i, i2);
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zzh(int i, long j) throws IOException {
/* 3 */             this.zza.zze(i, j);
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zzi(int i, int i2) throws IOException {
/* 3 */             this.zza.zzb(i, i2);
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zzj(int i, long j) throws IOException {
/* 3 */             this.zza.zzf(i, j);
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zzk(int i, int i2) throws IOException {
/* 3 */             this.zza.zzd(i, i2);
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zzl(int i, boolean z) throws IOException {
/* 3 */             this.zza.zzg(i, z);
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zzm(int i, String str) throws IOException {
/* 3 */             this.zza.zzh(i, str);
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zzn(int i, zzlg zzlgVar) throws IOException {
/* 3 */             this.zza.zzi(i, zzlgVar);
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zzo(int i, int i2) throws IOException {
/* 3 */             this.zza.zzc(i, i2);
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zzp(int i, int i2) throws IOException {
/* 6 */             zzll zzllVar = this.zza;
/* 8 */             zzllVar.zzc(i, (i2 >> 31) ^ (i2 + i2));
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zzq(int i, long j) throws IOException {
/* 7 */             zzll zzllVar = this.zza;
/* 9 */             zzllVar.zze(i, (j >> 63) ^ (j + j));
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zzr(int i, Object obj, zznw zznwVar) throws IOException {
/* 5 */             this.zza.zzl(i, (zznl) obj, zznwVar);
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zzs(int i, Object obj, zznw zznwVar) throws IOException {
/* 3 */             zzll zzllVar = this.zza;
/* 6 */             zzllVar.zza(i, 3);
/* 11 */            zznwVar.zzf((zznl) obj, zzllVar.zza);
/* 15 */            zzllVar.zza(i, 4);
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                @Deprecated
                public final void zzt(int i) throws IOException {
/* 4 */             this.zza.zza(i, 3);
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                @Deprecated
                public final void zzu(int i) throws IOException {
/* 4 */             this.zza.zza(i, 4);
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zzv(int i, Object obj) throws IOException {
/* 1 */             boolean z = obj instanceof zzlg;
/* 3 */             zzll zzllVar = this.zza;
/* 5 */             if (z) {
/* 9 */                 zzllVar.zzn(i, (zzlg) obj);
                    } else {
/* 15 */                zzllVar.zzm(i, (zznl) obj);
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zzw(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzmf)) {
/* 74 */                if (!z) {
/* 137 */                   while (i2 < list.size()) {
/* 151 */                       this.zza.zzb(i, ((Integer) list.get(i2)).intValue());
/* 154 */                       i2++;
                            }
/* 157 */                   return;
                        }
/* 76 */                zzll zzllVar = this.zza;
/* 78 */                zzllVar.zza(i, 2);
/* 82 */                int iZzA = 0;
/* 87 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 104 */                   iZzA += zzll.zzA(((Integer) list.get(i3)).intValue());
                        }
/* 108 */               zzllVar.zzr(iZzA);
/* 115 */               while (i2 < list.size()) {
/* 127 */                   zzllVar.zzq(((Integer) list.get(i2)).intValue());
/* 130 */                   i2++;
                        }
/* 157 */               return;
                    }
/* 7 */             zzmf zzmfVar = (zzmf) list;
/* 9 */             if (!z) {
/* 60 */                while (i2 < zzmfVar.size()) {
/* 68 */                    this.zza.zzb(i, zzmfVar.zzf(i2));
/* 71 */                    i2++;
                        }
/* 157 */               return;
                    }
/* 11 */            zzll zzllVar2 = this.zza;
/* 13 */            zzllVar2.zza(i, 2);
/* 17 */            int iZzA2 = 0;
/* 22 */            for (int i4 = 0; i4 < zzmfVar.size(); i4++) {
/* 33 */                iZzA2 += zzll.zzA(zzmfVar.zzf(i4));
                    }
/* 37 */            zzllVar2.zzr(iZzA2);
/* 44 */            while (i2 < zzmfVar.size()) {
/* 50 */                zzllVar2.zzq(zzmfVar.zzf(i2));
/* 53 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zzx(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzmf)) {
/* 69 */                if (!z) {
/* 127 */                   while (i2 < list.size()) {
/* 141 */                       this.zza.zzd(i, ((Integer) list.get(i2)).intValue());
/* 144 */                       i2++;
                            }
/* 147 */                   return;
                        }
/* 71 */                zzll zzllVar = this.zza;
/* 73 */                zzllVar.zza(i, 2);
/* 77 */                int i3 = 0;
/* 82 */                for (int i4 = 0; i4 < list.size(); i4++) {
/* 90 */                    ((Integer) list.get(i4)).getClass();
/* 93 */                    i3 += 4;
                        }
/* 98 */                zzllVar.zzr(i3);
/* 105 */               while (i2 < list.size()) {
/* 117 */                   zzllVar.zzs(((Integer) list.get(i2)).intValue());
/* 120 */                   i2++;
                        }
/* 147 */               return;
                    }
/* 7 */             zzmf zzmfVar = (zzmf) list;
/* 9 */             if (!z) {
/* 55 */                while (i2 < zzmfVar.size()) {
/* 63 */                    this.zza.zzd(i, zzmfVar.zzf(i2));
/* 66 */                    i2++;
                        }
/* 147 */               return;
                    }
/* 11 */            zzll zzllVar2 = this.zza;
/* 13 */            zzllVar2.zza(i, 2);
/* 17 */            int i5 = 0;
/* 22 */            for (int i6 = 0; i6 < zzmfVar.size(); i6++) {
/* 24 */                zzmfVar.zzf(i6);
/* 27 */                i5 += 4;
                    }
/* 32 */            zzllVar2.zzr(i5);
/* 39 */            while (i2 < zzmfVar.size()) {
/* 45 */                zzllVar2.zzs(zzmfVar.zzf(i2));
/* 48 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zzy(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzmz)) {
/* 73 */                if (!z) {
/* 135 */                   while (i2 < list.size()) {
/* 149 */                       this.zza.zze(i, ((Long) list.get(i2)).longValue());
/* 152 */                       i2++;
                            }
/* 155 */                   return;
                        }
/* 75 */                zzll zzllVar = this.zza;
/* 77 */                zzllVar.zza(i, 2);
/* 81 */                int iZzA = 0;
/* 86 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 102 */                   iZzA += zzll.zzA(((Long) list.get(i3)).longValue());
                        }
/* 106 */               zzllVar.zzr(iZzA);
/* 113 */               while (i2 < list.size()) {
/* 125 */                   zzllVar.zzt(((Long) list.get(i2)).longValue());
/* 128 */                   i2++;
                        }
/* 155 */               return;
                    }
/* 7 */             zzmz zzmzVar = (zzmz) list;
/* 9 */             if (!z) {
/* 59 */                while (i2 < zzmzVar.size()) {
/* 67 */                    this.zza.zze(i, zzmzVar.zzc(i2));
/* 70 */                    i2++;
                        }
/* 155 */               return;
                    }
/* 11 */            zzll zzllVar2 = this.zza;
/* 13 */            zzllVar2.zza(i, 2);
/* 17 */            int iZzA2 = 0;
/* 22 */            for (int i4 = 0; i4 < zzmzVar.size(); i4++) {
/* 32 */                iZzA2 += zzll.zzA(zzmzVar.zzc(i4));
                    }
/* 36 */            zzllVar2.zzr(iZzA2);
/* 43 */            while (i2 < zzmzVar.size()) {
/* 49 */                zzllVar2.zzt(zzmzVar.zzc(i2));
/* 52 */                i2++;
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zzou
                public final void zzz(int i, List list, boolean z) throws IOException {
/* 4 */             int i2 = 0;
/* 5 */             if (!(list instanceof zzmz)) {
/* 73 */                if (!z) {
/* 135 */                   while (i2 < list.size()) {
/* 149 */                       this.zza.zze(i, ((Long) list.get(i2)).longValue());
/* 152 */                       i2++;
                            }
/* 155 */                   return;
                        }
/* 75 */                zzll zzllVar = this.zza;
/* 77 */                zzllVar.zza(i, 2);
/* 81 */                int iZzA = 0;
/* 86 */                for (int i3 = 0; i3 < list.size(); i3++) {
/* 102 */                   iZzA += zzll.zzA(((Long) list.get(i3)).longValue());
                        }
/* 106 */               zzllVar.zzr(iZzA);
/* 113 */               while (i2 < list.size()) {
/* 125 */                   zzllVar.zzt(((Long) list.get(i2)).longValue());
/* 128 */                   i2++;
                        }
/* 155 */               return;
                    }
/* 7 */             zzmz zzmzVar = (zzmz) list;
/* 9 */             if (!z) {
/* 59 */                while (i2 < zzmzVar.size()) {
/* 67 */                    this.zza.zze(i, zzmzVar.zzc(i2));
/* 70 */                    i2++;
                        }
/* 155 */               return;
                    }
/* 11 */            zzll zzllVar2 = this.zza;
/* 13 */            zzllVar2.zza(i, 2);
/* 17 */            int iZzA2 = 0;
/* 22 */            for (int i4 = 0; i4 < zzmzVar.size(); i4++) {
/* 32 */                iZzA2 += zzll.zzA(zzmzVar.zzc(i4));
                    }
/* 36 */            zzllVar2.zzr(iZzA2);
/* 43 */            while (i2 < zzmzVar.size()) {
/* 49 */                zzllVar2.zzt(zzmzVar.zzc(i2));
/* 52 */                i2++;
                    }
                }
            }
