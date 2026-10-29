            package com.google.android.recaptcha.internal;

            import java.io.IOException;
            import java.io.InputStream;
            import java.io.OutputStream;
            import java.net.HttpURLConnection;
            import java.net.SocketTimeoutException;
            import java.net.UnknownServiceException;
            import p000.b40;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzhl {
                private final HttpURLConnection zza;

                public zzhl(HttpURLConnection httpURLConnection) {
/* 4 */             this.zza = httpURLConnection;
                }

                private final InputStream zzf() throws zzcg {
                    try {
/* 3 */                 return this.zza.getInputStream();
                    } catch (UnknownServiceException e) {
/* 67 */                throw new zzcg(zzce.zzc, zzcd.zzaf, e.getMessage(), null, 8, null);
                    } catch (IOException e2) {
/* 47 */                throw new zzcg(zzce.zzc, zzcd.zzae, e2.getMessage(), null, 8, null);
                    } catch (Exception e3) {
/* 27 */                throw new zzcg(zzce.zzc, zzcd.zzak, e3.getMessage(), null, 8, null);
                    }
                }

                private final OutputStream zzg() throws zzcg {
                    try {
/* 3 */                 return this.zza.getOutputStream();
                    } catch (UnknownServiceException e) {
/* 67 */                throw new zzcg(zzce.zzc, zzcd.zzaf, e.getMessage(), null, 8, null);
                    } catch (IOException e2) {
/* 47 */                throw new zzcg(zzce.zzc, zzcd.zzae, e2.getMessage(), null, 8, null);
                    } catch (Exception e3) {
/* 27 */                throw new zzcg(zzce.zzc, zzcd.zzak, e3.getMessage(), null, 8, null);
                    }
                }

                public final zzts zza(zzts zztsVar) throws IOException, zzcg {
                    try {
/* 3 */                 int responseCode = this.zza.getResponseCode();
/* 9 */                 if (responseCode != 200) {
/* 13 */                    if (responseCode == 400) {
/* 105 */                       throw new zzcg(zzce.zzc, zzcd.zzax, null, null, 12, null);
                            }
/* 17 */                    if (responseCode != 503 && responseCode != 403) {
/* 25 */                        if (responseCode != 404) {
/* 105 */                           throw new zzcg(zzce.zzc, zzcd.zzK, null, null, 12, null);
                                }
/* 105 */                       throw new zzcg(zzce.zzc, zzcd.zzi, null, null, 12, null);
                            }
/* 105 */                   throw new zzcg(zzce.zzi, zzcd.zzJ, null, null, 12, null);
                        }
/* 110 */               byte[] bArrM1210A = b40.m1210A(zzf());
/* 115 */               if (bArrM1210A.length == 0) {
/* 165 */                   throw new zzcg(zzce.zzc, zzcd.zzaw, null, null, 12, null);
                        }
                        try {
/* 121 */                   Object objZzb = zztsVar.zzD().zzb(bArrM1210A);
/* 125 */                   objZzb.getClass();
/* 128 */                   return (zzts) objZzb;
                        } catch (Exception e) {
/* 150 */                   throw new zzcg(zzce.zzc, zzcd.zzG, e.getMessage(), null, 8, null);
                        }
                    } catch (Exception e2) {
/* 185 */               throw new zzcg(zzce.zzc, zzcd.zzah, e2.getMessage(), null, 8, null);
                    }
                }

                public final HttpURLConnection zzb() {
/* 1 */             return this.zza;
                }

                public final void zzc() throws zzcg {
                    try {
/* 3 */                 this.zza.connect();
                    } catch (SocketTimeoutException e) {
/* 66 */                throw new zzcg(zzce.zzc, zzcd.zzac, e.getMessage(), null, 8, null);
                    } catch (IOException e2) {
/* 46 */                throw new zzcg(zzce.zzc, zzcd.zzad, e2.getMessage(), null, 8, null);
                    } catch (Exception e3) {
/* 26 */                throw new zzcg(zzce.zzc, zzcd.zzaj, e3.getMessage(), null, 8, null);
                    }
                }

                public final void zzd() {
/* 3 */             this.zza.disconnect();
                }

                public final void zze(byte[] bArr) throws zzcg {
                    try {
/* 5 */                 zzg().write(bArr);
                    } catch (zzcg e) {
/* 51 */                throw e;
                    } catch (IOException e2) {
/* 48 */                throw new zzcg(zzce.zzc, zzcd.zzag, e2.getMessage(), null, 8, null);
                    } catch (Exception e3) {
/* 28 */                throw new zzcg(zzce.zzc, zzcd.zzal, e3.getMessage(), null, 8, null);
                    }
                }
            }
