            package com.supercell.titan;

            import java.nio.ByteBuffer;
            import okhttp3.internal.http2.Http2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ByteFIFO implements ByteSource {

                /* JADX INFO: renamed from: a */
                public ByteBuffer f5730a;

                /* JADX INFO: renamed from: b */
                public ByteBuffer f5731b;

                public ByteFIFO() {
/* 6 */             ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(Http2.INITIAL_MAX_FRAME_SIZE);
/* 10 */            this.f5730a = byteBufferAllocateDirect;
/* 12 */            ByteBuffer byteBuffer = this.f5731b;
/* 14 */            if (byteBuffer != null) {
/* 16 */                byteBufferAllocateDirect.put(byteBuffer);
                    }
/* 31 */            this.f5731b = (ByteBuffer) this.f5730a.duplicate().flip();
                }

                @Override // com.supercell.titan.ByteSource
                public synchronized int available() {
/* 4 */             return this.f5731b.remaining();
                }

                @Override // com.supercell.titan.ByteSource
                public ByteBuffer getReadBuffer() {
/* 1 */             return this.f5731b;
                }

                @Override // com.supercell.titan.ByteSource
                public synchronized int read(ByteBuffer byteBuffer) {
/* 4 */             int iRemaining = this.f5731b.remaining();
/* 8 */             int iRemaining2 = byteBuffer.remaining();
/* 12 */            if (iRemaining2 >= iRemaining) {
/* 30 */                byteBuffer.put(this.f5731b);
/* 34 */                return iRemaining;
                    }
/* 14 */            byte[] bArr = new byte[iRemaining2];
/* 18 */            this.f5731b.get(bArr);
/* 21 */            byteBuffer.put(bArr);
/* 25 */            return iRemaining2;
                }

                public synchronized void write(ByteBuffer byteBuffer) {
                    try {
/* 12 */                if (this.f5730a.remaining() < byteBuffer.remaining()) {
/* 16 */                    int iCapacity = this.f5731b.capacity();
/* 22 */                    int iRemaining = this.f5731b.remaining();
/* 38 */                    if (iCapacity - iRemaining >= Math.max(byteBuffer.remaining(), iCapacity / 2)) {
/* 56 */                        this.f5730a.position(this.f5731b.compact().flip().limit());
                            } else {
/* 73 */                        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(Math.max(iCapacity * 2, iRemaining + byteBuffer.remaining()));
/* 77 */                        this.f5730a = byteBufferAllocateDirect;
/* 79 */                        ByteBuffer byteBuffer2 = this.f5731b;
/* 81 */                        if (byteBuffer2 != null) {
/* 83 */                            byteBufferAllocateDirect.put(byteBuffer2);
                                }
/* 98 */                        this.f5731b = (ByteBuffer) this.f5730a.duplicate().flip();
                            }
                        }
/* 102 */               this.f5730a.put(byteBuffer);
/* 113 */               this.f5731b.limit(this.f5730a.position());
                    } catch (Throwable th) {
/* 119 */               throw th;
                    }
                }
            }
