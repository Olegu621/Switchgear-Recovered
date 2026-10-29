            package org.fmod;

            import android.media.MediaCrypto;
            import android.media.MediaDataSource;
            import android.media.MediaExtractor;
            import android.media.MediaFormat;
            import android.view.Surface;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.IOException;
            import java.lang.reflect.InvocationHandler;
            import java.lang.reflect.Method;
            import java.nio.ByteBuffer;
            import java.util.Objects;
            import okio.Segment;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class MediaCodec {
                private long mCodecPtr = 0;
                private long mLength = 0;
                private int mSampleRate = 0;
                private int mChannelCount = 0;
                private boolean mInputFinished = false;
                private boolean mOutputFinished = false;
                private android.media.MediaCodec mDecoder = null;
                private Object mDataSourceProxy = null;
                private MediaExtractor mExtractor = null;
                private ByteBuffer[] mInputBuffers = null;
                private ByteBuffer[] mOutputBuffers = null;
                private int mCurrentOutputBufferIndex = -1;

                /* JADX INFO: renamed from: org.fmod.MediaCodec$1DataSource, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public class C1DataSource implements InvocationHandler {
                    public C1DataSource() {
                    }

                    @Override // java.lang.reflect.InvocationHandler
                    public Object invoke(Object obj, Method method, Object[] objArr) {
/* 11 */                if (method.getName().equals("readAt")) {
/* 48 */                    return Integer.valueOf(MediaCodec.fmodReadAt(MediaCodec.this.mCodecPtr, ((Long) objArr[0]).longValue(), (byte[]) objArr[1], 0, ((Integer) objArr[2]).intValue()));
                        }
/* 63 */                if (method.getName().equals("getSize")) {
/* 75 */                    return Long.valueOf(MediaCodec.fmodGetSize(MediaCodec.this.mCodecPtr));
                        }
/* 91 */                if (method.getName().equals("close")) {
/* 90 */                    return null;
                        }
/* 114 */               AbstractC1245n0.m4889q("fmod", "MediaCodec::DataSource::invoke : Unrecognised method found: " + method.getName());
/* 90 */                return null;
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static native long fmodGetSize(long j);

                /* JADX INFO: Access modifiers changed from: private */
                public static native int fmodReadAt(long j, long j2, byte[] bArr, int i, int i2);

                public int getChannelCount() {
/* 1 */             return this.mChannelCount;
                }

                public long getLength() {
/* 1 */             return this.mLength;
                }

                public int getSampleRate() {
/* 1 */             return this.mSampleRate;
                }

                public boolean init(long j) {
/* 5 */             this.mCodecPtr = j;
                    try {
/* 10 */                MediaExtractor mediaExtractor = new MediaExtractor();
/* 13 */                this.mExtractor = mediaExtractor;
/* 20 */                mediaExtractor.setDataSource(new MediaDataSource() { // from class: org.fmod.MediaCodec.2DataSource
                            @Override // java.io.Closeable, java.lang.AutoCloseable
                            public void close() {
                            }

                            @Override // android.media.MediaDataSource
                            public long getSize() {
/* 1 */                         return MediaCodec.fmodGetSize(MediaCodec.this.mCodecPtr);
                            }

                            @Override // android.media.MediaDataSource
                            public int readAt(long j2, byte[] bArr, int i, int i2) {
/* 1 */                         return MediaCodec.fmodReadAt(MediaCodec.this.mCodecPtr, j2, bArr, i, i2);
                            }
                        });
/* 25 */                int trackCount = this.mExtractor.getTrackCount();
/* 30 */                for (int i = 0; i < trackCount; i++) {
/* 34 */                    MediaFormat trackFormat = this.mExtractor.getTrackFormat(i);
/* 40 */                    String string = trackFormat.getString("mime");
/* 44 */                    trackFormat.toString();
/* 53 */                    if (string.equals("audio/mp4a-latm")) {
                                try {
/* 59 */                            this.mDecoder = android.media.MediaCodec.createDecoderByType(string);
/* 63 */                            this.mExtractor.selectTrack(i);
/* 69 */                            this.mDecoder.configure(trackFormat, (Surface) null, (MediaCrypto) null, 0);
/* 74 */                            this.mDecoder.start();
/* 83 */                            this.mInputBuffers = this.mDecoder.getInputBuffers();
/* 91 */                            this.mOutputBuffers = this.mDecoder.getOutputBuffers();
/* 106 */                           int integer = trackFormat.containsKey("encoder-delay") ? trackFormat.getInteger("encoder-delay") : 0;
/* 115 */                           int integer2 = trackFormat.containsKey("encoder-padding") ? trackFormat.getInteger("encoder-padding") : 0;
/* 121 */                           long j2 = trackFormat.getLong("durationUs");
/* 131 */                           this.mChannelCount = trackFormat.getInteger("channel-count");
/* 135 */                           int integer3 = trackFormat.getInteger("sample-rate");
/* 139 */                           this.mSampleRate = integer3;
/* 155 */                           this.mLength = (((int) (((j2 * ((long) integer3)) + 999999) / 1000000)) - integer) - integer2;
/* 157 */                           return true;
                                } catch (IOException e) {
/* 176 */                           AbstractC1245n0.m4876d("fmod", "MediaCodec::init : " + e.toString());
/* 7 */                             return false;
                                }
                            }
                        }
/* 7 */                 return false;
                    } catch (IOException e2) {
/* 202 */               AbstractC1245n0.m4889q("fmod", "MediaCodec::init : " + e2.toString());
/* 7 */                 return false;
                    }
                }

                public int read(byte[] bArr, int i) {
                    int iDequeueInputBuffer;
/* 17 */            int i2 = (this.mInputFinished && this.mOutputFinished && this.mCurrentOutputBufferIndex == -1) ? -1 : 0;
/* 21 */            while (!this.mInputFinished && (iDequeueInputBuffer = this.mDecoder.dequeueInputBuffer(0L)) >= 0) {
/* 39 */                int sampleData = this.mExtractor.readSampleData(this.mInputBuffers[iDequeueInputBuffer], 0);
/* 43 */                android.media.MediaCodec mediaCodec = this.mDecoder;
/* 45 */                if (sampleData >= 0) {
/* 55 */                    mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, sampleData, this.mExtractor.getSampleTime(), 0);
/* 60 */                    this.mExtractor.advance();
                        } else {
/* 69 */                    mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
/* 72 */                    this.mInputFinished = true;
                        }
                    }
/* 77 */            if (!this.mOutputFinished && this.mCurrentOutputBufferIndex == -1) {
/* 85 */                android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
/* 92 */                int iDequeueOutputBuffer = this.mDecoder.dequeueOutputBuffer(bufferInfo, 10000L);
/* 96 */                if (iDequeueOutputBuffer >= 0) {
/* 98 */                    this.mCurrentOutputBufferIndex = iDequeueOutputBuffer;
/* 106 */                   this.mOutputBuffers[iDequeueOutputBuffer].limit(bufferInfo.size);
/* 115 */                   this.mOutputBuffers[iDequeueOutputBuffer].position(bufferInfo.offset);
                        } else if (iDequeueOutputBuffer == -3) {
/* 128 */                   this.mOutputBuffers = this.mDecoder.getOutputBuffers();
                        } else if (iDequeueOutputBuffer == -2) {
/* 140 */                   Objects.toString(this.mDecoder.getOutputFormat());
                        } else if (iDequeueOutputBuffer != -1) {
/* 163 */                   AbstractC1245n0.m4889q("fmod", "MediaCodec::read : MediaCodec::dequeueOutputBuffer returned " + iDequeueOutputBuffer);
                        }
/* 170 */               if ((bufferInfo.flags & 4) != 0) {
/* 172 */                   this.mOutputFinished = true;
                        }
                    }
/* 174 */           int i3 = this.mCurrentOutputBufferIndex;
/* 176 */           if (i3 == -1) {
/* 214 */               return i2;
                    }
/* 180 */           ByteBuffer byteBuffer = this.mOutputBuffers[i3];
/* 188 */           int iMin = Math.min(byteBuffer.remaining(), i);
/* 192 */           byteBuffer.get(bArr, 0, iMin);
/* 199 */           if (!byteBuffer.hasRemaining()) {
/* 201 */               byteBuffer.clear();
/* 208 */               this.mDecoder.releaseOutputBuffer(this.mCurrentOutputBufferIndex, false);
/* 211 */               this.mCurrentOutputBufferIndex = -1;
                    }
/* 213 */           return iMin;
                }

                public void release() {
/* 1 */             android.media.MediaCodec mediaCodec = this.mDecoder;
/* 4 */             if (mediaCodec != null) {
/* 6 */                 mediaCodec.stop();
/* 11 */                this.mDecoder.release();
/* 14 */                this.mDecoder = null;
                    }
/* 16 */            MediaExtractor mediaExtractor = this.mExtractor;
/* 18 */            if (mediaExtractor != null) {
/* 20 */                mediaExtractor.release();
/* 23 */                this.mExtractor = null;
                    }
                }

                public void seek(int i) {
/* 1 */             int i2 = this.mCurrentOutputBufferIndex;
/* 4 */             if (i2 != -1) {
/* 10 */                this.mOutputBuffers[i2].clear();
/* 13 */                this.mCurrentOutputBufferIndex = -1;
                    }
/* 16 */            this.mInputFinished = false;
/* 18 */            this.mOutputFinished = false;
/* 22 */            this.mDecoder.flush();
                    long j = i;
/* 37 */            this.mExtractor.seekTo((j * 1000000) / ((long) this.mSampleRate), 0);
/* 54 */            long sampleTime = ((this.mExtractor.getSampleTime() * ((long) this.mSampleRate)) + 999999) / 1000000;
/* 63 */            int i3 = (int) ((j - sampleTime) * ((long) this.mChannelCount) * 2);
/* 64 */            if (i3 >= 0) {
/* 96 */                byte[] bArr = new byte[Segment.SHARE_MINIMUM];
/* 98 */                while (i3 > 0) {
/* 108 */                   i3 -= read(bArr, Math.min(Segment.SHARE_MINIMUM, i3));
                        }
                    } else {
/* 90 */                AbstractC1245n0.m4889q("fmod", "MediaCodec::seek : Seek to " + i + " resulted in position " + sampleTime);
                    }
                }
            }
