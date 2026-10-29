            package p000;

            import android.media.session.MediaSessionManager;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     public final class rf1 implements qf1 {

                /* JADX INFO: renamed from: a */
                public final MediaSessionManager.RemoteUserInfo f16037a;

                public rf1(String str, int i, int i2) {
/* 8 */             this.f16037a = sk0.m8530h(i, i2, str);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof rf1) {
/* 1 */                 return this.f16037a.equals(((rf1) obj).f16037a);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 7 */             return Objects.hash(this.f16037a);
                }

/* 10 */        public rf1(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
/* 12 */            this.f16037a = remoteUserInfo;
                }
            }
