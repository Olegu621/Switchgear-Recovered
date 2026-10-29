.class public final Lcom/google/android/gms/internal/drive/zzi;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/google/android/gms/internal/drive/zzh;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 12

    .line 1
    invoke-static {p1}, Lqj3;->P(Landroid/os/Parcel;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    move v5, v0

    .line 10
    move v7, v5

    .line 11
    move-object v6, v1

    .line 12
    move-wide v8, v2

    .line 13
    move-wide v10, v8

    .line 14
    :goto_0
    invoke-virtual {p1}, Landroid/os/Parcel;->dataPosition()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-ge v0, p0, :cond_5

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    int-to-char v1, v0

    .line 25
    const/4 v2, 0x2

    .line 26
    if-eq v1, v2, :cond_4

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    if-eq v1, v2, :cond_3

    .line 30
    .line 31
    const/4 v2, 0x4

    .line 32
    if-eq v1, v2, :cond_2

    .line 33
    .line 34
    const/4 v2, 0x5

    .line 35
    if-eq v1, v2, :cond_1

    .line 36
    .line 37
    const/4 v2, 0x6

    .line 38
    if-eq v1, v2, :cond_0

    .line 39
    .line 40
    invoke-static {v0, p1}, Lqj3;->K(ILandroid/os/Parcel;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-static {v0, p1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 45
    .line 46
    .line 47
    move-result-wide v10

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-static {v0, p1}, Lqj3;->F(ILandroid/os/Parcel;)J

    .line 50
    .line 51
    .line 52
    move-result-wide v8

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    invoke-static {v0, p1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    goto :goto_0

    .line 59
    :cond_3
    sget-object v1, Lcom/google/android/gms/drive/DriveId;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 60
    .line 61
    invoke-static {p1, v0, v1}, Lqj3;->i(Landroid/os/Parcel;ILandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    move-object v6, v0

    .line 66
    check-cast v6, Lcom/google/android/gms/drive/DriveId;

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    invoke-static {v0, p1}, Lqj3;->D(ILandroid/os/Parcel;)I

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    goto :goto_0

    .line 74
    :cond_5
    invoke-static {p0, p1}, Lqj3;->s(ILandroid/os/Parcel;)V

    .line 75
    .line 76
    .line 77
    new-instance v4, Lcom/google/android/gms/internal/drive/zzh;

    .line 78
    .line 79
    invoke-direct/range {v4 .. v11}, Lcom/google/android/gms/internal/drive/zzh;-><init>(ILcom/google/android/gms/drive/DriveId;IJJ)V

    .line 80
    .line 81
    .line 82
    return-object v4
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 0

    .line 1
    new-array p0, p1, [Lcom/google/android/gms/internal/drive/zzh;

    .line 2
    .line 3
    return-object p0
.end method
