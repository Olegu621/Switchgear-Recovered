.class public final Lcom/google/android/recaptcha/internal/zzxc;
.super Lcom/google/android/recaptcha/internal/zzsn;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lcom/google/android/recaptcha/internal/zztt;


# static fields
.field private static final zzb:Lcom/google/android/recaptcha/internal/zzxc;

.field private static volatile zzd:Lcom/google/android/recaptcha/internal/zzua;


# instance fields
.field private zze:I

.field private zzf:I

.field private zzg:I

.field private zzh:Ljava/lang/String;

.field private zzi:Ljava/lang/String;

.field private zzj:Lcom/google/android/recaptcha/internal/zzrv;

.field private zzk:Lcom/google/android/recaptcha/internal/zzut;

.field private zzl:I

.field private zzm:Lcom/google/android/recaptcha/internal/zzwj;

.field private zzn:Lcom/google/android/recaptcha/internal/zzsu;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/google/android/recaptcha/internal/zzxc;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zzxc;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/google/android/recaptcha/internal/zzxc;->zzb:Lcom/google/android/recaptcha/internal/zzxc;

    .line 7
    .line 8
    const-class v1, Lcom/google/android/recaptcha/internal/zzxc;

    .line 9
    .line 10
    invoke-static {v1, v0}, Lcom/google/android/recaptcha/internal/zzsn;->zzI(Ljava/lang/Class;Lcom/google/android/recaptcha/internal/zzsn;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzsn;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzxc;->zzh:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzxc;->zzi:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {}, Lcom/google/android/recaptcha/internal/zzsn;->zzB()Lcom/google/android/recaptcha/internal/zzsu;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lcom/google/android/recaptcha/internal/zzxc;->zzn:Lcom/google/android/recaptcha/internal/zzsu;

    .line 15
    .line 16
    return-void
.end method

.method public static bridge synthetic zzf()Lcom/google/android/recaptcha/internal/zzxc;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/recaptcha/internal/zzxc;->zzb:Lcom/google/android/recaptcha/internal/zzxc;

    .line 2
    .line 3
    return-object v0
.end method

.method public static zzg()Lcom/google/android/recaptcha/internal/zzxc;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/recaptcha/internal/zzxc;->zzb:Lcom/google/android/recaptcha/internal/zzxc;

    .line 2
    .line 3
    return-object v0
.end method

.method public static zzi([B)Lcom/google/android/recaptcha/internal/zzxc;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/recaptcha/internal/zzsx;
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/google/android/recaptcha/internal/zzxc;->zzb:Lcom/google/android/recaptcha/internal/zzxc;

    .line 2
    .line 3
    invoke-static {v0, p0}, Lcom/google/android/recaptcha/internal/zzsn;->zzx(Lcom/google/android/recaptcha/internal/zzsn;[B)Lcom/google/android/recaptcha/internal/zzsn;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/google/android/recaptcha/internal/zzxc;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final zzh(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    add-int/lit8 p1, p1, -0x1

    .line 2
    .line 3
    if-eqz p1, :cond_7

    .line 4
    .line 5
    const/4 p0, 0x2

    .line 6
    if-eq p1, p0, :cond_6

    .line 7
    .line 8
    const/4 p0, 0x3

    .line 9
    if-eq p1, p0, :cond_5

    .line 10
    .line 11
    const/4 p0, 0x4

    .line 12
    const/4 p2, 0x0

    .line 13
    if-eq p1, p0, :cond_4

    .line 14
    .line 15
    const/4 p0, 0x5

    .line 16
    if-eq p1, p0, :cond_3

    .line 17
    .line 18
    const/4 p0, 0x6

    .line 19
    if-ne p1, p0, :cond_2

    .line 20
    .line 21
    sget-object p0, Lcom/google/android/recaptcha/internal/zzxc;->zzd:Lcom/google/android/recaptcha/internal/zzua;

    .line 22
    .line 23
    if-nez p0, :cond_1

    .line 24
    .line 25
    const-class p1, Lcom/google/android/recaptcha/internal/zzxc;

    .line 26
    .line 27
    monitor-enter p1

    .line 28
    :try_start_0
    sget-object p0, Lcom/google/android/recaptcha/internal/zzxc;->zzd:Lcom/google/android/recaptcha/internal/zzua;

    .line 29
    .line 30
    if-nez p0, :cond_0

    .line 31
    .line 32
    new-instance p0, Lcom/google/android/recaptcha/internal/zzsi;

    .line 33
    .line 34
    sget-object p2, Lcom/google/android/recaptcha/internal/zzxc;->zzb:Lcom/google/android/recaptcha/internal/zzxc;

    .line 35
    .line 36
    invoke-direct {p0, p2}, Lcom/google/android/recaptcha/internal/zzsi;-><init>(Lcom/google/android/recaptcha/internal/zzsn;)V

    .line 37
    .line 38
    .line 39
    sput-object p0, Lcom/google/android/recaptcha/internal/zzxc;->zzd:Lcom/google/android/recaptcha/internal/zzua;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    move-object p0, v0

    .line 44
    goto :goto_1

    .line 45
    :cond_0
    :goto_0
    monitor-exit p1

    .line 46
    return-object p0

    .line 47
    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    throw p0

    .line 49
    :cond_1
    return-object p0

    .line 50
    :cond_2
    throw p2

    .line 51
    :cond_3
    sget-object p0, Lcom/google/android/recaptcha/internal/zzxc;->zzb:Lcom/google/android/recaptcha/internal/zzxc;

    .line 52
    .line 53
    return-object p0

    .line 54
    :cond_4
    new-instance p0, Lcom/google/android/recaptcha/internal/zzxa;

    .line 55
    .line 56
    invoke-direct {p0, p2}, Lcom/google/android/recaptcha/internal/zzxa;-><init>(Lcom/google/android/recaptcha/internal/zzxb;)V

    .line 57
    .line 58
    .line 59
    return-object p0

    .line 60
    :cond_5
    new-instance p0, Lcom/google/android/recaptcha/internal/zzxc;

    .line 61
    .line 62
    invoke-direct {p0}, Lcom/google/android/recaptcha/internal/zzxc;-><init>()V

    .line 63
    .line 64
    .line 65
    return-object p0

    .line 66
    :cond_6
    const-string v0, "zze"

    .line 67
    .line 68
    const-string v1, "zzf"

    .line 69
    .line 70
    const-string v2, "zzj"

    .line 71
    .line 72
    const-string v3, "zzk"

    .line 73
    .line 74
    const-string v4, "zzl"

    .line 75
    .line 76
    const-string v5, "zzn"

    .line 77
    .line 78
    const-class v6, Lcom/google/android/recaptcha/internal/zzwt;

    .line 79
    .line 80
    const-string v7, "zzg"

    .line 81
    .line 82
    const-string v8, "zzh"

    .line 83
    .line 84
    const-string v9, "zzi"

    .line 85
    .line 86
    const-string v10, "zzm"

    .line 87
    .line 88
    filled-new-array/range {v0 .. v10}, [Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    sget-object p1, Lcom/google/android/recaptcha/internal/zzxc;->zzb:Lcom/google/android/recaptcha/internal/zzxc;

    .line 93
    .line 94
    const-string p2, "\u0000\t\u0000\u0001\u0001\u000b\t\u0000\u0001\u0000\u0001\u0004\u0003\u1009\u0000\u0004\u1009\u0001\u0005\u000c\u0007\u001b\u0008\u000c\t\u0208\n\u0208\u000b\u1009\u0002"

    .line 95
    .line 96
    invoke-static {p1, p2, p0}, Lcom/google/android/recaptcha/internal/zzsn;->zzF(Lcom/google/android/recaptcha/internal/zzts;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    return-object p0

    .line 101
    :cond_7
    const/4 p0, 0x1

    .line 102
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    return-object p0
.end method
