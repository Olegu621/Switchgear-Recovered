            package android.support.v4.media.session;

            import android.os.Parcel;
            import android.os.Parcelable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 33 */    public class ParcelableVolumeInfo implements Parcelable {
                public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new Parcelable.Creator<ParcelableVolumeInfo>() { // from class: android.support.v4.media.session.ParcelableVolumeInfo.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
/* 3 */                 return new ParcelableVolumeInfo(parcel);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
/* 5 */             public ParcelableVolumeInfo[] newArray(int i) {
/* 6 */                 return new ParcelableVolumeInfo[i];
                    }
                };
                public int audioStream;
                public int controlType;
                public int currentVolume;
                public int maxVolume;
                public int volumeType;

                public ParcelableVolumeInfo(Parcel parcel) {
/* 8 */             this.volumeType = parcel.readInt();
/* 14 */            this.controlType = parcel.readInt();
/* 20 */            this.maxVolume = parcel.readInt();
/* 26 */            this.currentVolume = parcel.readInt();
/* 32 */            this.audioStream = parcel.readInt();
                }

                @Override // android.os.Parcelable
                public int describeContents() {
/* 1 */             return 0;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeInt(this.volumeType);
/* 8 */             parcel.writeInt(this.controlType);
/* 13 */            parcel.writeInt(this.maxVolume);
/* 18 */            parcel.writeInt(this.currentVolume);
/* 23 */            parcel.writeInt(this.audioStream);
                }

/* 34 */        public ParcelableVolumeInfo(int i, int i2, int i3, int i4, int i5) {
/* 36 */            this.volumeType = i;
/* 37 */            this.audioStream = i2;
/* 38 */            this.controlType = i3;
/* 39 */            this.maxVolume = i4;
/* 40 */            this.currentVolume = i5;
                }
            }
