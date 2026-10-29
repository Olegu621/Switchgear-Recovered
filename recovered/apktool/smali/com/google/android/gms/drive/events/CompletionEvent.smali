.class public final Lcom/google/android/gms/drive/events/CompletionEvent;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;

# interfaces
.implements Lcom/google/android/gms/drive/events/ResourceEvent;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/drive/events/CompletionEvent;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Lcom/google/android/gms/drive/DriveId;

.field public final b:Ljava/lang/String;

.field public final c:Landroid/os/ParcelFileDescriptor;

.field public final d:Landroid/os/ParcelFileDescriptor;

.field public final e:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

.field public final f:Ljava/util/List;

.field public final i:I

.field public final v:Landroid/os/IBinder;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ltf3;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ltf3;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/google/android/gms/drive/events/CompletionEvent;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/drive/DriveId;Ljava/lang/String;Landroid/os/ParcelFileDescriptor;Landroid/os/ParcelFileDescriptor;Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;Ljava/util/ArrayList;ILandroid/os/IBinder;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->a:Lcom/google/android/gms/drive/DriveId;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->c:Landroid/os/ParcelFileDescriptor;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->d:Landroid/os/ParcelFileDescriptor;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->e:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->f:Ljava/util/List;

    .line 15
    .line 16
    iput p7, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->i:I

    .line 17
    .line 18
    iput-object p8, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->v:Landroid/os/IBinder;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final getType()I
    .locals 0

    .line 1
    const/4 p0, 0x2

    .line 2
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->f:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "<null>"

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string v1, "\',\'"

    .line 9
    .line 10
    invoke-static {v1, v0}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    add-int/lit8 v1, v1, 0x2

    .line 23
    .line 24
    new-instance v2, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 27
    .line 28
    .line 29
    const-string v1, "\'"

    .line 30
    .line 31
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :goto_0
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 45
    .line 46
    iget v2, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->i:I

    .line 47
    .line 48
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    iget-object p0, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->a:Lcom/google/android/gms/drive/DriveId;

    .line 53
    .line 54
    filled-new-array {p0, v2, v0}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    const-string v0, "CompletionEvent [id=%s, status=%s, trackingTag=%s]"

    .line 59
    .line 60
    invoke-static {v1, v0, p0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    .line 1
    or-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    const/16 v0, 0x4f45

    .line 4
    .line 5
    invoke-static {v0, p1}, Lw11;->c0(ILandroid/os/Parcel;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x2

    .line 10
    iget-object v2, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->a:Lcom/google/android/gms/drive/DriveId;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-static {p1, v1, v2, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x3

    .line 17
    iget-object v2, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->b:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {p1, v1, v2, v3}, Lw11;->T(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->c:Landroid/os/ParcelFileDescriptor;

    .line 23
    .line 24
    const/4 v2, 0x4

    .line 25
    invoke-static {p1, v2, v1, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x5

    .line 29
    iget-object v4, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->d:Landroid/os/ParcelFileDescriptor;

    .line 30
    .line 31
    invoke-static {p1, v1, v4, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 32
    .line 33
    .line 34
    const/4 v1, 0x6

    .line 35
    iget-object v4, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->e:Lcom/google/android/gms/drive/metadata/internal/MetadataBundle;

    .line 36
    .line 37
    invoke-static {p1, v1, v4, p2, v3}, Lw11;->S(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 38
    .line 39
    .line 40
    const/4 p2, 0x7

    .line 41
    iget-object v1, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->f:Ljava/util/List;

    .line 42
    .line 43
    invoke-static {p1, v1, p2}, Lw11;->V(Landroid/os/Parcel;Ljava/util/List;I)V

    .line 44
    .line 45
    .line 46
    const/16 p2, 0x8

    .line 47
    .line 48
    invoke-static {p1, p2, v2}, Lw11;->b0(Landroid/os/Parcel;II)V

    .line 49
    .line 50
    .line 51
    iget p2, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->i:I

    .line 52
    .line 53
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 54
    .line 55
    .line 56
    const/16 p2, 0x9

    .line 57
    .line 58
    iget-object p0, p0, Lcom/google/android/gms/drive/events/CompletionEvent;->v:Landroid/os/IBinder;

    .line 59
    .line 60
    invoke-static {p1, p2, p0}, Lw11;->O(Landroid/os/Parcel;ILandroid/os/IBinder;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v0, p1}, Lw11;->f0(ILandroid/os/Parcel;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method
