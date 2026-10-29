            package com.google.android.gms.internal.drive;

            import android.os.RemoteException;
            import com.google.android.gms.common.api.Status;
            import io.sentry.C1697u2;
            import p000.i13;
            import p000.iq1;
            import p000.v81;
            import p000.w81;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    final class zzdk extends zzl {
                private final /* synthetic */ zzch zzfw;
                private final w81 zzgj;
                private final v81 zzgk;

                public zzdk(zzch zzchVar, w81 w81Var, v81 v81Var) {
/* 1 */             this.zzfw = zzchVar;
/* 6 */             this.zzgj = w81Var;
/* 8 */             this.zzgk = v81Var;
                }

                private final void zza(zzdg<iq1> zzdgVar) {
/* 8 */             this.zzgk.m9229a(new zzdo(this, zzdgVar));
                }

                @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
/* 11 */        public final void zza(final zzfl zzflVar) throws RemoteException {
/* 12 */            zza(new zzdg(zzflVar) { // from class: com.google.android.gms.internal.drive.zzdm
                        private final zzfl zzgn;

                        {
/* 4 */                     this.zzgn = zzflVar;
                        }

                        @Override // com.google.android.gms.internal.drive.zzdg
                        public final void accept(Object obj) {
/* 1 */                     zzfl zzflVar2 = this.zzgn;
/* 3 */                     if (obj != null) {
/* 14 */                        throw new ClassCastException();
                            }
/* 5 */                     long j = zzflVar2.zzhy;
/* 8 */                     throw null;
                        }
                    });
                }

                @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
/* 12 */        public final void zza(final zzfh zzfhVar) throws RemoteException {
/* 13 */            zza(new zzdg(this, zzfhVar) { // from class: com.google.android.gms.internal.drive.zzdn
                        private final zzdk zzgl;
                        private final zzfh zzgo;

                        {
/* 4 */                     this.zzgl = this;
/* 6 */                     this.zzgo = zzfhVar;
                        }

                        @Override // com.google.android.gms.internal.drive.zzdg
                        public final void accept(Object obj) {
/* 1 */                     zzdk zzdkVar = this.zzgl;
/* 3 */                     zzfh zzfhVar2 = this.zzgo;
/* 5 */                     if (obj == null) {
/* 8 */                         zzdkVar.zza(zzfhVar2, (iq1) null);
                            } else {
/* 12 */                        C1697u2.m5431g();
                            }
                        }
                    });
                }

                @Override // com.google.android.gms.internal.drive.zzl, com.google.android.gms.internal.drive.zzeq
/* 13 */        public final void zza(final Status status) throws RemoteException {
/* 14 */            zza(new zzdg(this, status) { // from class: com.google.android.gms.internal.drive.zzdl
                        private final zzdk zzgl;
                        private final Status zzgm;

                        {
/* 4 */                     this.zzgl = this;
/* 6 */                     this.zzgm = status;
                        }

                        @Override // com.google.android.gms.internal.drive.zzdg
                        public final void accept(Object obj) {
/* 1 */                     zzdk zzdkVar = this.zzgl;
/* 3 */                     Status status2 = this.zzgm;
/* 5 */                     if (obj == null) {
/* 8 */                         zzdkVar.zza(status2, (iq1) null);
                            } else {
/* 12 */                        C1697u2.m5431g();
                            }
                        }
                    });
                }

/* 14 */        public final /* synthetic */ void zza(zzfh zzfhVar, iq1 iq1Var) {
/* 17 */            new zzbi(zzfhVar.zzes);
                    throw null;
                }

/* 17 */        public final /* synthetic */ void zza(Status status, iq1 iq1Var) {
/* 18 */            i13.m4438q(status);
                    throw null;
                }
            }
