.class public final Ljr3;
.super Leo3;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field private static final zzm:Ljr3;


# instance fields
.field private zza:I

.field private zze:I

.field private zzf:Ljava/lang/Object;

.field private zzg:I

.field private zzh:Lor3;

.field private zzi:I

.field private zzj:Lcn3;

.field private zzk:Lam3;

.field private zzl:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ljr3;

    .line 2
    .line 3
    invoke-direct {v0}, Ljr3;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ljr3;->zzm:Ljr3;

    .line 7
    .line 8
    const-class v1, Ljr3;

    .line 9
    .line 10
    invoke-static {v1, v0}, Leo3;->f(Ljava/lang/Class;Leo3;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Leo3;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Ljr3;->zze:I

    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    iput-byte v0, p0, Ljr3;->zzl:B

    .line 9
    .line 10
    sget-object v0, Lcn3;->b:Lan3;

    .line 11
    .line 12
    iput-object v0, p0, Ljr3;->zzj:Lcn3;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final l(ILeo3;)Ljava/lang/Object;
    .locals 10

    .line 1
    add-int/lit8 p1, p1, -0x1

    .line 2
    .line 3
    if-eqz p1, :cond_5

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    if-eq p1, v0, :cond_4

    .line 7
    .line 8
    const/4 v0, 0x3

    .line 9
    if-eq p1, v0, :cond_3

    .line 10
    .line 11
    const/4 v0, 0x4

    .line 12
    if-eq p1, v0, :cond_2

    .line 13
    .line 14
    const/4 v0, 0x5

    .line 15
    if-eq p1, v0, :cond_1

    .line 16
    .line 17
    if-nez p2, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x1

    .line 22
    :goto_0
    iput-byte p1, p0, Ljr3;->zzl:B

    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return-object p0

    .line 26
    :cond_1
    sget-object p0, Ljr3;->zzm:Ljr3;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_2
    new-instance p0, Lfm3;

    .line 30
    .line 31
    sget-object p1, Ljr3;->zzm:Ljr3;

    .line 32
    .line 33
    invoke-direct {p0, p1}, Lzn3;-><init>(Leo3;)V

    .line 34
    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_3
    new-instance p0, Ljr3;

    .line 38
    .line 39
    invoke-direct {p0}, Ljr3;-><init>()V

    .line 40
    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_4
    const-string v8, "zzh"

    .line 44
    .line 45
    const-class v9, Lgr3;

    .line 46
    .line 47
    const-string v0, "zzf"

    .line 48
    .line 49
    const-string v1, "zze"

    .line 50
    .line 51
    const-string v2, "zza"

    .line 52
    .line 53
    const-string v3, "zzg"

    .line 54
    .line 55
    const-string v4, "zzi"

    .line 56
    .line 57
    const-string v5, "zzj"

    .line 58
    .line 59
    const-class v6, Lcr3;

    .line 60
    .line 61
    const-string v7, "zzk"

    .line 62
    .line 63
    filled-new-array/range {v0 .. v9}, [Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    sget-object p1, Ljr3;->zzm:Ljr3;

    .line 68
    .line 69
    new-instance p2, Laq3;

    .line 70
    .line 71
    const-string v0, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0002\u0001\u1004\u0000\u0002\u1004\u0002\u0003\u100a\u0003\u0004\u043c\u0000\u0005\u1409\u0004\u0006\u1009\u0001\u0007<\u0000"

    .line 72
    .line 73
    invoke-direct {p2, p1, v0, p0}, Laq3;-><init>(Ltm3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    return-object p2

    .line 77
    :cond_5
    iget-byte p0, p0, Ljr3;->zzl:B

    .line 78
    .line 79
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0
.end method
