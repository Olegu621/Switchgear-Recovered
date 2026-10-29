            package p000;

            import io.sentry.C1697u2;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.logging.Logger;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class vp3 implements bq3 {

                /* JADX INFO: renamed from: a */
                public final tm3 f18282a;

                /* JADX INFO: renamed from: b */
                public final nq3 f18283b;

                /* JADX INFO: renamed from: c */
                public final boolean f18284c;

                /* JADX INFO: renamed from: d */
                public final qn3 f18285d;

                public vp3(nq3 nq3Var, qn3 qn3Var, tm3 tm3Var) {
/* 4 */             this.f18283b = nq3Var;
/* 8 */             this.f18284c = tm3Var instanceof bo3;
/* 10 */            this.f18285d = qn3Var;
/* 12 */            this.f18282a = tm3Var;
                }

                @Override // p000.bq3
                /* JADX INFO: renamed from: a */
                public final int mo1406a(eo3 eo3Var) {
/* 3 */             this.f18283b.getClass();
/* 8 */             int iHashCode = eo3Var.zzc.hashCode();
/* 14 */            if (!this.f18284c) {
/* 30 */                return iHashCode;
                    }
/* 28 */            return ((bo3) eo3Var).zza.f17607a.hashCode() + (iHashCode * 53);
                }

                /* JADX WARN: Code duplicated, block: B:28:0x007a  */
                /* JADX WARN: Code duplicated, block: B:54:0x0080 A[EDGE_INSN: B:54:0x0080->B:30:0x0080 BREAK  A[LOOP:1: B:16:0x004d->B:57:0x004d], SYNTHETIC] */
                @Override // p000.bq3
                /* JADX INFO: renamed from: b */
                public final void mo1407b(Object obj, byte[] bArr, int i, int i2, ym3 ym3Var) throws uo3 {
                    int iM9416Z;
/* 2 */             eo3 eo3Var = (eo3) obj;
/* 4 */             mq3 mq3VarM6789a = eo3Var.zzc;
/* 8 */             if (mq3VarM6789a == mq3.f13977f) {
/* 10 */                mq3VarM6789a = mq3.m6789a();
/* 14 */                eo3Var.zzc = mq3VarM6789a;
                    }
/* 16 */            mq3 mq3Var = mq3VarM6789a;
/* 17 */            bo3 bo3Var = (bo3) obj;
/* 19 */            un3 un3Var = bo3Var.zza;
/* 23 */            if (un3Var.f17608b) {
/* 29 */                bo3Var.zza = un3Var.clone();
                    }
/* 31 */            while (i < i2) {
/* 33 */                int iM9416Z2 = w11.m9416Z(bArr, i, ym3Var);
/* 37 */                int i3 = ym3Var.f19707a;
/* 39 */                on3 on3Var = ym3Var.f19710d;
/* 43 */                tm3 tm3Var = this.f18282a;
/* 46 */                if (i3 == 11) {
/* 73 */                    byte[] bArr2 = bArr;
/* 74 */                    int i4 = i2;
/* 75 */                    ym3 ym3Var2 = ym3Var;
/* 76 */                    cn3 cn3Var = null;
/* 77 */                    int i5 = 0;
                            while (true) {
/* 78 */                        if (iM9416Z2 >= i4) {
/* 128 */                           iM9416Z = iM9416Z2;
                                    break;
                                }
/* 80 */                        iM9416Z = w11.m9416Z(bArr2, iM9416Z2, ym3Var2);
/* 84 */                        int i6 = ym3Var2.f19707a;
/* 86 */                        int i7 = i6 >>> 3;
/* 88 */                        int i8 = i6 & 7;
/* 90 */                        if (i7 == 2) {
/* 107 */                           if (i8 != 0) {
/* 121 */                               if (i6 != 12) {
                                            break;
                                            break;
                                        }
/* 123 */                               iM9416Z2 = w11.m9445o0(i6, bArr2, iM9416Z, i4, ym3Var2);
                                    } else {
/* 109 */                               iM9416Z2 = w11.m9416Z(bArr2, iM9416Z, ym3Var2);
/* 113 */                               i5 = ym3Var2.f19707a;
/* 115 */                               on3Var.m7217b(tm3Var, i5);
                                    }
                                } else if (i7 != 3 || i8 != 2) {
/* 121 */                           if (i6 != 12) {
                                        break;
                                    } else {
/* 123 */                               iM9416Z2 = w11.m9445o0(i6, bArr2, iM9416Z, i4, ym3Var2);
                                    }
                                } else {
/* 98 */                            iM9416Z2 = w11.m9438k0(bArr2, iM9416Z, ym3Var2);
/* 104 */                           cn3Var = (cn3) ym3Var2.f19709c;
                                }
                            }
/* 129 */                   if (cn3Var != null) {
/* 134 */                       mq3Var.m6792d((i5 << 3) | 2, cn3Var);
                            }
/* 137 */                   i = iM9416Z;
/* 138 */                   bArr = bArr2;
/* 139 */                   i2 = i4;
/* 140 */                   ym3Var = ym3Var2;
                        } else if ((i3 & 7) == 2) {
/* 54 */                    on3Var.m7217b(tm3Var, i3 >>> 3);
/* 60 */                    i = w11.m9443n0(i3, bArr, iM9416Z2, i2, mq3Var, ym3Var);
                        } else {
/* 68 */                    i = w11.m9445o0(i3, bArr, iM9416Z2, i2, ym3Var);
                        }
                    }
/* 143 */           if (i != i2) {
/* 150 */               throw uo3.m9058c();
                    }
                }

                @Override // p000.bq3
                /* JADX INFO: renamed from: c */
                public final boolean mo1408c(eo3 eo3Var, eo3 eo3Var2) {
/* 3 */             this.f18283b.getClass();
/* 14 */            if (!eo3Var.zzc.equals(eo3Var2.zzc)) {
/* 16 */                return false;
                    }
/* 20 */            if (this.f18284c) {
/* 30 */                return ((bo3) eo3Var).zza.equals(((bo3) eo3Var2).zza);
                    }
/* 35 */            return true;
                }

                @Override // p000.bq3
                /* JADX INFO: renamed from: d */
                public final int mo1409d(eo3 eo3Var) {
/* 3 */             this.f18283b.getClass();
/* 6 */             mq3 mq3Var = eo3Var.zzc;
/* 8 */             int iM7492o = mq3Var.f13981d;
/* 12 */            if (iM7492o == -1) {
/* 14 */                iM7492o = 0;
/* 18 */                for (int i = 0; i < mq3Var.f13978a; i++) {
/* 24 */                    int i2 = mq3Var.f13979b[i] >>> 3;
/* 30 */                    cn3 cn3Var = (cn3) mq3Var.f13980c[i];
/* 32 */                    Logger logger = kn3.f12895e;
/* 34 */                    int iMo320c = cn3Var.mo320c();
/* 42 */                    int iM6154p = kn3.m6154p(iMo320c) + iMo320c;
/* 45 */                    int iM6154p2 = kn3.m6154p(16);
/* 49 */                    int iM6154p3 = kn3.m6154p(i2);
/* 55 */                    int iM6154p4 = kn3.m6154p(8);
/* 64 */                    iM7492o = pm2.m7492o(24, iM6154p, iM6154p2 + iM6154p3 + iM6154p4 + iM6154p4, iM7492o);
                        }
/* 71 */                mq3Var.f13981d = iM7492o;
                    }
/* 75 */            if (this.f18284c) {
/* 81 */                hq3 hq3Var = ((bo3) eo3Var).zza.f17607a;
/* 90 */                if (hq3Var.f9203b.size() > 0) {
/* 127 */                   Map.Entry entryM4265a = hq3Var.m4265a(0);
/* 135 */                   if (entryM4265a.getKey() != null) {
/* 137 */                       C1697u2.m5431g();
/* 11 */                        return 0;
                            }
/* 141 */                   entryM4265a.getValue();
/* 144 */                   throw null;
                        }
/* 96 */                Iterator it = hq3Var.m4266b().iterator();
/* 104 */               if (it.hasNext()) {
/* 111 */                   Map.Entry entry = (Map.Entry) it.next();
/* 117 */                   if (entry.getKey() != null) {
/* 119 */                       C1697u2.m5431g();
/* 11 */                        return 0;
                            }
/* 123 */                   entry.getValue();
/* 126 */                   throw null;
                        }
                    }
/* 145 */           return iM7492o;
                }

                @Override // p000.bq3
                /* JADX INFO: renamed from: e */
                public final void mo1410e(Object obj, pi3 pi3Var) throws C1868kw {
/* 10 */            ff2 ff2Var = (ff2) ((bo3) obj).zza.m9046c();
/* 16 */            if (ff2Var.hasNext()) {
/* 112 */               ((Map.Entry) ff2Var.next()).getKey().getClass();
/* 115 */               C1697u2.m5431g();
/* 118 */               return;
                    }
/* 20 */            this.f18283b.getClass();
/* 25 */            mq3 mq3Var = ((eo3) obj).zzc;
/* 30 */            for (int i = 0; i < mq3Var.f13978a; i++) {
/* 37 */                int i2 = mq3Var.f13979b[i] >>> 3;
/* 40 */                Object obj2 = mq3Var.f13980c[i];
/* 42 */                boolean z = obj2 instanceof cn3;
/* 46 */                kn3 kn3Var = (kn3) pi3Var.f15137a;
/* 53 */                if (z) {
/* 57 */                    kn3Var.m6165j(11);
/* 60 */                    kn3Var.m6158c(2, i2);
/* 63 */                    kn3Var.m6162g(3, (cn3) obj2);
/* 66 */                    kn3Var.m6165j(12);
                        } else {
/* 72 */                    kn3Var.m6165j(11);
/* 75 */                    kn3Var.m6158c(2, i2);
/* 80 */                    kn3Var.m6165j(26);
/* 83 */                    eo3 eo3Var = (eo3) ((tm3) obj2);
/* 89 */                    kn3Var.m6165j(eo3Var.m3542d());
/* 92 */                    eo3Var.m3543j(kn3Var);
/* 95 */                    kn3Var.m6165j(12);
                        }
                    }
                }

                @Override // p000.bq3
                public final Object zza() {
/* 1 */             tm3 tm3Var = this.f18282a;
                    return tm3Var instanceof eo3 ? (eo3) ((eo3) tm3Var).mo317l(4, null) : ((zn3) ((eo3) tm3Var).mo317l(5, null)).mo3154c();
                }

                @Override // p000.bq3
                public final void zzd(Object obj, Object obj2) {
/* 3 */             cq3.m2857n(this.f18283b, obj, obj2);
/* 8 */             if (this.f18284c) {
/* 12 */                cq3.m2856m(this.f18285d, obj, obj2);
                    }
                }

                @Override // p000.bq3
                public final void zzj(Object obj) {
/* 3 */             this.f18283b.getClass();
/* 9 */             mq3 mq3Var = ((eo3) obj).zzc;
/* 13 */            if (mq3Var.f13982e) {
/* 16 */                mq3Var.f13982e = false;
                    }
/* 22 */            ((bo3) obj).zza.m9044a();
                }

                @Override // p000.bq3
                public final boolean zzk(Object obj) {
/* 5 */             ((bo3) obj).zza.m9047d();
/* 8 */             return true;
                }
            }
