            package com.google.android.gms.internal.drive;

            import android.os.ParcelFileDescriptor;
            import com.google.android.gms.drive.Contents;
            import com.google.android.gms.drive.DriveId;
            import io.sentry.AbstractC1552m4;
            import io.sentry.InterfaceC1525k1;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.instrumentation.file.C1496c;
            import io.sentry.instrumentation.file.C1500g;
            import io.sentry.util.AbstractC1712k;
            import java.io.File;
            import java.io.FileDescriptor;
            import java.io.FileInputStream;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.io.OutputStream;
            import okhttp3.HttpUrl;
            import p000.C0872e9;
            import p000.ea0;
            import p000.eb3;
            import p000.f42;
            import p000.fa0;
            import p000.gn3;
            import p000.hi1;
            import p000.kb1;
            import p000.kf0;
            import p000.mr0;
            import p000.sr1;
            import p000.tr0;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 12 */    public final class zzbi implements fa0 {
                private static final mr0 zzbz = new mr0("DriveContentsImpl", HttpUrl.FRAGMENT_ENCODE_SET);
                private final Contents zzes;
                private boolean closed = false;
                private boolean zzet = false;
                private boolean zzeu = false;

                public zzbi(Contents contents) {
/* 11 */            kb1.m6061n(contents);
/* 14 */            this.zzes = contents;
                }

                private final sr1 zza(tr0 tr0Var, hi1 hi1Var, gn3 gn3Var) {
/* 7 */             if (this.zzes.f3633c == 268435456) {
/* 27 */                throw new IllegalStateException("Cannot commit contents opened with MODE_READ_ONLY");
                    }
/* 9 */             C0872e9 c0872e9 = ea0.f7592a;
/* 11 */            tr0Var.getClass();
/* 19 */            throw new UnsupportedOperationException();
                }

                public final sr1 commit(tr0 tr0Var, hi1 hi1Var, kf0 kf0Var) {
/* 9 */             return zza(tr0Var, hi1Var, kf0Var == null ? null : gn3.m3979a(kf0Var));
                }

                public final void discard(tr0 tr0Var) {
/* 3 */             if (this.closed) {
/* 34 */                f42.m3656l("DriveContents already closed.");
/* 37 */                return;
                    }
/* 5 */             zzj();
/* 28 */            ((zzbm) ((eb3) tr0Var).f7609b.doWrite(new zzbm(this, tr0Var))).setResultCallback(new zzbl(this));
                }

                @Override // p000.fa0
                public final DriveId getDriveId() {
/* 3 */             return this.zzes.f3634d;
                }

                public final InputStream getInputStream() {
/* 4 */             if (this.closed) {
/* 51 */                f42.m3656l("Contents have been closed, cannot access the input stream.");
/* 3 */                 return null;
                    }
/* 6 */             Contents contents = this.zzes;
/* 12 */            if (contents.f3633c != 268435456) {
/* 45 */                f42.m3656l("getInputStream() can only be used with contents opened with MODE_READ_ONLY.");
/* 3 */                 return null;
                    }
/* 16 */            if (this.zzet) {
/* 39 */                f42.m3656l("getInputStream() can only be called once per Contents instance.");
/* 3 */                 return null;
                    }
/* 19 */            this.zzet = true;
/* 25 */            FileDescriptor fileDescriptor = contents.f3631a.getFileDescriptor();
/* 32 */            return AbstractC1417a.m5165c(new FileInputStream(fileDescriptor), fileDescriptor);
                }

                @Override // p000.fa0
                public final int getMode() {
/* 3 */             return this.zzes.f3633c;
                }

                public final OutputStream getOutputStream() {
/* 3 */             File file = null;
/* 4 */             if (this.closed) {
/* 111 */               f42.m3656l("Contents have been closed, cannot access the output stream.");
/* 3 */                 return null;
                    }
/* 6 */             Contents contents = this.zzes;
/* 12 */            if (contents.f3633c != 536870912) {
/* 105 */               f42.m3656l("getOutputStream() can only be used with contents opened with MODE_WRITE_ONLY.");
/* 3 */                 return null;
                    }
/* 16 */            if (this.zzeu) {
/* 99 */                f42.m3656l("getOutputStream() can only be called once per Contents instance.");
/* 3 */                 return null;
                    }
/* 19 */            this.zzeu = true;
/* 25 */            FileDescriptor fileDescriptor = contents.f3631a.getFileDescriptor();
/* 29 */            FileOutputStream fileOutputStream = new FileOutputStream(fileDescriptor);
/* 44 */            if (!AbstractC1552m4.m5357b().mo5092l().isTracingEnabled()) {
/* 96 */                return fileOutputStream;
                    }
/* 65 */            InterfaceC1525k1 interfaceC1525k1Mo5093m = AbstractC1712k.f11736a ? AbstractC1552m4.m5357b().mo5093m() : AbstractC1552m4.m5357b().mo5087g();
/* 92 */            return new C1500g(new C1496c(file, interfaceC1525k1Mo5093m != null ? interfaceC1525k1Mo5093m.mo4735p("file.write") : null, fileOutputStream, AbstractC1552m4.m5357b().mo5092l()), fileDescriptor);
                }

                public final ParcelFileDescriptor getParcelFileDescriptor() {
/* 3 */             if (!this.closed) {
/* 7 */                 return this.zzes.f3631a;
                    }
/* 12 */            f42.m3656l("Contents have been closed, cannot access the output stream.");
/* 15 */            return null;
                }

                public final sr1 reopenForWrite(tr0 tr0Var) {
/* 4 */             if (this.closed) {
/* 39 */                f42.m3656l("DriveContents already closed.");
/* 3 */                 return null;
                    }
/* 12 */            if (this.zzes.f3633c != 268435456) {
/* 33 */                f42.m3656l("reopenForWrite can only be used with DriveContents opened with MODE_READ_ONLY.");
/* 3 */                 return null;
                    }
/* 14 */            zzj();
/* 26 */            return ((eb3) tr0Var).f7609b.doRead(new zzbj(this, tr0Var));
                }

                @Override // p000.fa0
                public final Contents zzi() {
/* 1 */             return this.zzes;
                }

                @Override // p000.fa0
                public final void zzj() {
/* 3 */             ParcelFileDescriptor parcelFileDescriptor = this.zzes.f3631a;
/* 5 */             if (parcelFileDescriptor != null) {
                        try {
/* 7 */                     parcelFileDescriptor.close();
                        } catch (IOException unused) {
                        }
                    }
/* 11 */            this.closed = true;
                }

                @Override // p000.fa0
                public final boolean zzk() {
/* 1 */             return this.closed;
                }

/* 13 */        public final sr1 commit(tr0 tr0Var, hi1 hi1Var) {
/* 14 */            return zza(tr0Var, hi1Var, null);
                }
            }
