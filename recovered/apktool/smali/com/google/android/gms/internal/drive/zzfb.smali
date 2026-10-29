.class public final Lcom/google/android/gms/internal/drive/zzfb;
.super Lcom/google/android/gms/internal/drive/zzkk;

# interfaces
.implements Lcom/google/android/gms/internal/drive/zzls;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/drive/zzfb$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/drive/zzkk<",
        "Lcom/google/android/gms/internal/drive/zzfb;",
        "Lcom/google/android/gms/internal/drive/zzfb$zza;",
        ">;",
        "Lcom/google/android/gms/internal/drive/zzls;"
    }
.end annotation


# static fields
.field private static volatile zzhk:Lcom/google/android/gms/internal/drive/zzmb;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/drive/zzmb<",
            "Lcom/google/android/gms/internal/drive/zzfb;",
            ">;"
        }
    .end annotation
.end field

.field private static final zzhp:Lcom/google/android/gms/internal/drive/zzfb;


# instance fields
.field private zzhd:I

.field private zzhe:I

.field private zzhg:J

.field private zzhi:B

.field private zzhm:Ljava/lang/String;

.field private zzhn:J

.field private zzho:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/gms/internal/drive/zzfb;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/gms/internal/drive/zzfb;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/gms/internal/drive/zzfb;->zzhp:Lcom/google/android/gms/internal/drive/zzfb;

    .line 7
    .line 8
    const-class v1, Lcom/google/android/gms/internal/drive/zzfb;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/drive/zzkk;->zza(Ljava/lang/Class;Lcom/google/android/gms/internal/drive/zzkk;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/internal/drive/zzkk;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    iput-byte v0, p0, Lcom/google/android/gms/internal/drive/zzfb;->zzhi:B

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput v0, p0, Lcom/google/android/gms/internal/drive/zzfb;->zzhe:I

    .line 9
    .line 10
    const-string v0, ""

    .line 11
    .line 12
    iput-object v0, p0, Lcom/google/android/gms/internal/drive/zzfb;->zzhm:Ljava/lang/String;

    .line 13
    .line 14
    const-wide/16 v0, -0x1

    .line 15
    .line 16
    iput-wide v0, p0, Lcom/google/android/gms/internal/drive/zzfb;->zzhn:J

    .line 17
    .line 18
    iput-wide v0, p0, Lcom/google/android/gms/internal/drive/zzfb;->zzhg:J

    .line 19
    .line 20
    const/4 v0, -0x1

    .line 21
    iput v0, p0, Lcom/google/android/gms/internal/drive/zzfb;->zzho:I

    .line 22
    .line 23
    return-void
.end method

.method public static zza([BLcom/google/android/gms/internal/drive/zzjx;)Lcom/google/android/gms/internal/drive/zzfb;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/drive/zzkq;
        }
    .end annotation

    .line 99
    sget-object v0, Lcom/google/android/gms/internal/drive/zzfb;->zzhp:Lcom/google/android/gms/internal/drive/zzfb;

    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/drive/zzkk;->zza(Lcom/google/android/gms/internal/drive/zzkk;[BLcom/google/android/gms/internal/drive/zzjx;)Lcom/google/android/gms/internal/drive/zzkk;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/drive/zzfb;

    return-object p0
.end method

.method private final zza(J)V
    .locals 1

    .line 100
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzfb;->zzhd:I

    or-int/lit8 v0, v0, 0x8

    iput v0, p0, Lcom/google/android/gms/internal/drive/zzfb;->zzhd:I

    .line 101
    iput-wide p1, p0, Lcom/google/android/gms/internal/drive/zzfb;->zzhg:J

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/drive/zzfb;I)V
    .locals 0

    const/4 p1, 0x1

    .line 102
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/drive/zzfb;->zzj(I)V

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/drive/zzfb;J)V
    .locals 0

    .line 104
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/drive/zzfb;->zzf(J)V

    return-void
.end method

.method public static synthetic zza(Lcom/google/android/gms/internal/drive/zzfb;Ljava/lang/String;)V
    .locals 0

    .line 103
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/drive/zzfb;->zzd(Ljava/lang/String;)V

    return-void
.end method

.method public static zzan()Lcom/google/android/gms/internal/drive/zzfb$zza;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/drive/zzfb;->zzhp:Lcom/google/android/gms/internal/drive/zzfb;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/drive/zzkk;->zzcw()Lcom/google/android/gms/internal/drive/zzkk$zza;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/gms/internal/drive/zzfb$zza;

    .line 8
    .line 9
    return-object v0
.end method

.method public static synthetic zzao()Lcom/google/android/gms/internal/drive/zzfb;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/drive/zzfb;->zzhp:Lcom/google/android/gms/internal/drive/zzfb;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic zzb(Lcom/google/android/gms/internal/drive/zzfb;I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/drive/zzfb;->zzl(I)V

    return-void
.end method

.method public static synthetic zzb(Lcom/google/android/gms/internal/drive/zzfb;J)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/drive/zzfb;->zza(J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final zzd(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzfb;->zzhd:I

    .line 5
    .line 6
    or-int/lit8 v0, v0, 0x2

    .line 7
    .line 8
    iput v0, p0, Lcom/google/android/gms/internal/drive/zzfb;->zzhd:I

    .line 9
    .line 10
    iput-object p1, p0, Lcom/google/android/gms/internal/drive/zzfb;->zzhm:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method private final zzf(J)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzfb;->zzhd:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x4

    .line 4
    .line 5
    iput v0, p0, Lcom/google/android/gms/internal/drive/zzfb;->zzhd:I

    .line 6
    .line 7
    iput-wide p1, p0, Lcom/google/android/gms/internal/drive/zzfb;->zzhn:J

    .line 8
    .line 9
    return-void
.end method

.method private final zzj(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzfb;->zzhd:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Lcom/google/android/gms/internal/drive/zzfb;->zzhd:I

    .line 6
    .line 7
    iput p1, p0, Lcom/google/android/gms/internal/drive/zzfb;->zzhe:I

    .line 8
    .line 9
    return-void
.end method

.method private final zzl(I)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/google/android/gms/internal/drive/zzfb;->zzhd:I

    .line 2
    .line 3
    or-int/lit8 v0, v0, 0x10

    .line 4
    .line 5
    iput v0, p0, Lcom/google/android/gms/internal/drive/zzfb;->zzhd:I

    .line 6
    .line 7
    iput p1, p0, Lcom/google/android/gms/internal/drive/zzfb;->zzho:I

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final getResourceId()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/internal/drive/zzfb;->zzhm:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getResourceType()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/google/android/gms/internal/drive/zzfb;->zzho:I

    .line 2
    .line 3
    return p0
.end method

.method public final zza(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object p3, Lcom/google/android/gms/internal/drive/zzfc;->zzhl:[I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    sub-int/2addr p1, v0

    .line 5
    aget p1, p3, p1

    .line 6
    .line 7
    const/4 p3, 0x0

    .line 8
    packed-switch p1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lf42;->p()V

    .line 12
    .line 13
    .line 14
    return-object p3

    .line 15
    :pswitch_0
    if-nez p2, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    :cond_0
    int-to-byte p1, v0

    .line 19
    iput-byte p1, p0, Lcom/google/android/gms/internal/drive/zzfb;->zzhi:B

    .line 20
    .line 21
    return-object p3

    .line 22
    :pswitch_1
    iget-byte p0, p0, Lcom/google/android/gms/internal/drive/zzfb;->zzhi:B

    .line 23
    .line 24
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_2
    sget-object p0, Lcom/google/android/gms/internal/drive/zzfb;->zzhk:Lcom/google/android/gms/internal/drive/zzmb;

    .line 30
    .line 31
    if-nez p0, :cond_2

    .line 32
    .line 33
    const-class p1, Lcom/google/android/gms/internal/drive/zzfb;

    .line 34
    .line 35
    monitor-enter p1

    .line 36
    :try_start_0
    sget-object p0, Lcom/google/android/gms/internal/drive/zzfb;->zzhk:Lcom/google/android/gms/internal/drive/zzmb;

    .line 37
    .line 38
    if-nez p0, :cond_1

    .line 39
    .line 40
    new-instance p0, Lcom/google/android/gms/internal/drive/zzkk$zzb;

    .line 41
    .line 42
    sget-object p2, Lcom/google/android/gms/internal/drive/zzfb;->zzhp:Lcom/google/android/gms/internal/drive/zzfb;

    .line 43
    .line 44
    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/drive/zzkk$zzb;-><init>(Lcom/google/android/gms/internal/drive/zzkk;)V

    .line 45
    .line 46
    .line 47
    sput-object p0, Lcom/google/android/gms/internal/drive/zzfb;->zzhk:Lcom/google/android/gms/internal/drive/zzmb;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    move-object p0, v0

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    :goto_0
    monitor-exit p1

    .line 54
    return-object p0

    .line 55
    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    throw p0

    .line 57
    :cond_2
    return-object p0

    .line 58
    :pswitch_3
    sget-object p0, Lcom/google/android/gms/internal/drive/zzfb;->zzhp:Lcom/google/android/gms/internal/drive/zzfb;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_4
    const-string v0, "zzhd"

    .line 62
    .line 63
    const-string v1, "zzhe"

    .line 64
    .line 65
    const-string v2, "zzhm"

    .line 66
    .line 67
    const-string v3, "zzhn"

    .line 68
    .line 69
    const-string v4, "zzhg"

    .line 70
    .line 71
    const-string v5, "zzho"

    .line 72
    .line 73
    filled-new-array/range {v0 .. v5}, [Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    const-string p1, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001\u0504\u0000\u0002\u0508\u0001\u0003\u0510\u0002\u0004\u0510\u0003\u0005\u0004\u0004"

    .line 78
    .line 79
    sget-object p2, Lcom/google/android/gms/internal/drive/zzfb;->zzhp:Lcom/google/android/gms/internal/drive/zzfb;

    .line 80
    .line 81
    invoke-static {p2, p1, p0}, Lcom/google/android/gms/internal/drive/zzkk;->zza(Lcom/google/android/gms/internal/drive/zzlq;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    return-object p0

    .line 86
    :pswitch_5
    new-instance p0, Lcom/google/android/gms/internal/drive/zzfb$zza;

    .line 87
    .line 88
    invoke-direct {p0, p3}, Lcom/google/android/gms/internal/drive/zzfb$zza;-><init>(Lcom/google/android/gms/internal/drive/zzfc;)V

    .line 89
    .line 90
    .line 91
    return-object p0

    .line 92
    :pswitch_6
    new-instance p0, Lcom/google/android/gms/internal/drive/zzfb;

    .line 93
    .line 94
    invoke-direct {p0}, Lcom/google/android/gms/internal/drive/zzfb;-><init>()V

    .line 95
    .line 96
    .line 97
    return-object p0

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final zzal()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/internal/drive/zzfb;->zzhn:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final zzam()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/google/android/gms/internal/drive/zzfb;->zzhg:J

    .line 2
    .line 3
    return-wide v0
.end method
