            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class xc3 {

                /* JADX INFO: renamed from: a */
                public final int f19029a;

                /* JADX INFO: renamed from: b */
                public final long f19030b;

                /* JADX INFO: renamed from: c */
                public final long f19031c;

                /* JADX INFO: renamed from: d */
                public final int f19032d;

                /* JADX INFO: renamed from: e */
                public final String f19033e;

                public xc3(int i, long j, long j2, int i2, String str) {
/* 4 */             this.f19029a = i;
/* 6 */             this.f19030b = j;
/* 8 */             this.f19031c = j2;
/* 10 */            this.f19032d = i2;
/* 12 */            if (str != null) {
/* 14 */                this.f19033e = str;
                    } else {
/* 19 */                C1951n4.m6868s("Null packageName");
/* 23 */                throw null;
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof xc3) {
/* 10 */                xc3 xc3Var = (xc3) obj;
/* 16 */                if (this.f19029a == xc3Var.f19029a && this.f19030b == xc3Var.f19030b && this.f19031c == xc3Var.f19031c && this.f19032d == xc3Var.f19032d && this.f19033e.equals(xc3Var.f19033e)) {
/* 1 */                     return true;
                        }
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 6 */             int i = this.f19029a ^ 1000003;
/* 7 */             long j = this.f19030b;
/* 14 */            long j2 = this.f19031c;
/* 37 */            return this.f19033e.hashCode() ^ (((((((i * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f19032d) * 1000003);
                }

                public final String toString() {
/* 58 */            return "InstallState{installStatus=" + this.f19029a + ", bytesDownloaded=" + this.f19030b + ", totalBytesToDownload=" + this.f19031c + ", installErrorCode=" + this.f19032d + ", packageName=" + this.f19033e + "}";
                }
            }
