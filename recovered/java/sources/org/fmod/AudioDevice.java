            package org.fmod;

            import android.media.AudioTrack;
            import io.sentry.android.core.AbstractC1245n0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class AudioDevice {
                private AudioTrack mTrack = null;

                private int fetchChannelConfigFromCount(int i) {
/* 3 */             if (i == 1) {
/* 2 */                 return 2;
                    }
/* 6 */             if (i == 2) {
/* 8 */                 return 3;
                    }
/* 11 */            if (i == 6) {
/* 13 */                return 252;
                    }
                    return i == 8 ? 6396 : 0;
                }

                public void close() {
                    try {
/* 3 */                 this.mTrack.stop();
                    } catch (IllegalStateException unused) {
/* 11 */                AbstractC1245n0.m4876d("fmod", "AudioDevice::init : AudioTrack stop caused IllegalStateException");
                    }
/* 16 */            this.mTrack.release();
/* 20 */            this.mTrack = null;
                }

                public boolean init(int i, int i2, int i3, int i4) {
/* 1 */             int iFetchChannelConfigFromCount = fetchChannelConfigFromCount(i);
/* 6 */             int minBufferSize = AudioTrack.getMinBufferSize(i2, iFetchChannelConfigFromCount, 2);
/* 12 */            if (minBufferSize < 0) {
/* 16 */                AbstractC1245n0.m4889q("fmod", "AudioDevice::init : Couldn't query minimum buffer size, possibly unsupported sample rate or channel count");
                    }
/* 21 */            int i5 = i3 * i4 * i * 2;
                    try {
/* 34 */                AudioTrack audioTrack = new AudioTrack(3, i2, iFetchChannelConfigFromCount, 2, i5 > minBufferSize ? i5 : minBufferSize, 1);
/* 37 */                this.mTrack = audioTrack;
                        try {
/* 39 */                    audioTrack.play();
/* 42 */                    return true;
                        } catch (IllegalStateException unused) {
/* 46 */                    AbstractC1245n0.m4876d("fmod", "AudioDevice::init : AudioTrack play caused IllegalStateException");
/* 51 */                    this.mTrack.release();
/* 55 */                    this.mTrack = null;
/* 27 */                    return false;
                        }
                    } catch (IllegalArgumentException unused2) {
/* 60 */                AbstractC1245n0.m4876d("fmod", "AudioDevice::init : AudioTrack creation caused IllegalArgumentException");
/* 27 */                return false;
                    }
                }

                public void write(short[] sArr, int i) {
/* 4 */             this.mTrack.write(sArr, 0, i);
                }
            }
