.class public final Lcom/google/android/libraries/play/games/internal/zzcs;
.super Lcom/google/android/libraries/play/games/internal/zzcv;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/libraries/play/games/internal/zzcs;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final f:J

.field public final i:Lcom/google/android/libraries/play/games/internal/zzcl;

.field public final v:J


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ljava/security/SecureRandom;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/Random;->nextLong()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    const-wide/high16 v2, -0x8000000000000000L

    .line 11
    .line 12
    cmp-long v2, v0, v2

    .line 13
    .line 14
    if-nez v2, :cond_0

    .line 15
    .line 16
    const-wide/16 v0, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    :goto_0
    new-instance v2, Ljava/util/concurrent/atomic/AtomicLong;

    .line 24
    .line 25
    invoke-direct {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 26
    .line 27
    .line 28
    new-instance v0, Lre3;

    .line 29
    .line 30
    const/16 v1, 0x18

    .line 31
    .line 32
    invoke-direct {v0, v1}, Lre3;-><init>(I)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lcom/google/android/libraries/play/games/internal/zzcs;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 36
    .line 37
    return-void
.end method

.method public synthetic constructor <init>(Lsr3;Ljava/util/HashSet;Lig3;JJLcom/google/android/libraries/play/games/internal/zzcl;J)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/google/android/libraries/play/games/internal/zzcv;-><init>(Lsr3;Ljava/util/HashSet;Lig3;J)V

    .line 2
    .line 3
    .line 4
    iput-object p8, p0, Lcom/google/android/libraries/play/games/internal/zzcs;->i:Lcom/google/android/libraries/play/games/internal/zzcl;

    .line 5
    .line 6
    iput-wide p6, p0, Lcom/google/android/libraries/play/games/internal/zzcs;->f:J

    .line 7
    .line 8
    iput-wide p9, p0, Lcom/google/android/libraries/play/games/internal/zzcs;->v:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/google/android/libraries/play/games/internal/zzcv;->d:J

    .line 2
    .line 3
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 4
    .line 5
    .line 6
    const/4 p2, -0x1

    .line 7
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 8
    .line 9
    .line 10
    iget-object p2, p0, Lcom/google/android/libraries/play/games/internal/zzcv;->c:Lsr3;

    .line 11
    .line 12
    invoke-virtual {p2}, Lzn3;->b()Leo3;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    invoke-static {p2, v0}, Leo3;->h(Leo3;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    check-cast p2, Ltr3;

    .line 27
    .line 28
    invoke-virtual {p2}, Ltm3;->a()[B

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    array-length v0, p2

    .line 33
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeByteArray([B)V

    .line 37
    .line 38
    .line 39
    iget-object p2, p0, Lcom/google/android/libraries/play/games/internal/zzcv;->b:Ljava/util/HashSet;

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/util/HashSet;->size()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    const/4 v1, 0x0

    .line 57
    if-eqz v0, :cond_0

    .line 58
    .line 59
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    check-cast v0, Lcom/google/android/libraries/play/games/internal/zzcv;

    .line 64
    .line 65
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/libraries/play/games/internal/zzcv;->e(Landroid/os/Parcel;)V

    .line 70
    .line 71
    .line 72
    iget-wide v2, p0, Lcom/google/android/libraries/play/games/internal/zzcs;->f:J

    .line 73
    .line 74
    invoke-virtual {p1, v2, v3}, Landroid/os/Parcel;->writeLong(J)V

    .line 75
    .line 76
    .line 77
    iget-object p2, p0, Lcom/google/android/libraries/play/games/internal/zzcs;->i:Lcom/google/android/libraries/play/games/internal/zzcl;

    .line 78
    .line 79
    invoke-virtual {p1, p2, v1}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 80
    .line 81
    .line 82
    iget-wide v0, p0, Lcom/google/android/libraries/play/games/internal/zzcs;->v:J

    .line 83
    .line 84
    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :cond_1
    new-instance p0, Llq3;

    .line 89
    .line 90
    invoke-direct {p0}, Llq3;-><init>()V

    .line 91
    .line 92
    .line 93
    throw p0
.end method
