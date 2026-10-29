.class public final Lcm3;
.super Lbo3;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field private static final zzf:Lcm3;


# instance fields
.field private zze:B


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcm3;

    .line 2
    .line 3
    invoke-direct {v0}, Lcm3;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcm3;->zzf:Lcm3;

    .line 7
    .line 8
    const-class v1, Lcm3;

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
    invoke-direct {p0}, Lbo3;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    iput-byte v0, p0, Lcm3;->zze:B

    .line 6
    .line 7
    return-void
.end method

.method public static o([BLon3;)Lcm3;
    .locals 1

    .line 1
    sget-object v0, Lcm3;->zzf:Lcm3;

    .line 2
    .line 3
    invoke-static {v0, p0, p1}, Leo3;->i(Leo3;[BLon3;)Leo3;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcm3;

    .line 8
    .line 9
    return-object p0
.end method

.method public static p()Lcm3;
    .locals 1

    .line 1
    sget-object v0, Lcm3;->zzf:Lcm3;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public final l(ILeo3;)Ljava/lang/Object;
    .locals 2

    .line 1
    add-int/lit8 p1, p1, -0x1

    .line 2
    .line 3
    if-eqz p1, :cond_5

    .line 4
    .line 5
    const/4 v0, 0x2

    .line 6
    const/4 v1, 0x0

    .line 7
    if-eq p1, v0, :cond_4

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    if-eq p1, v0, :cond_3

    .line 11
    .line 12
    const/4 v0, 0x4

    .line 13
    if-eq p1, v0, :cond_2

    .line 14
    .line 15
    const/4 v0, 0x5

    .line 16
    if-eq p1, v0, :cond_1

    .line 17
    .line 18
    if-nez p2, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p1, 0x1

    .line 23
    :goto_0
    iput-byte p1, p0, Lcm3;->zze:B

    .line 24
    .line 25
    return-object v1

    .line 26
    :cond_1
    sget-object p0, Lcm3;->zzf:Lcm3;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_2
    new-instance p0, Ldl3;

    .line 30
    .line 31
    sget-object p1, Lcm3;->zzf:Lcm3;

    .line 32
    .line 33
    invoke-direct {p0, p1}, Lzn3;-><init>(Leo3;)V

    .line 34
    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_3
    new-instance p0, Lcm3;

    .line 38
    .line 39
    invoke-direct {p0}, Lcm3;-><init>()V

    .line 40
    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_4
    sget-object p0, Lcm3;->zzf:Lcm3;

    .line 44
    .line 45
    new-instance p1, Laq3;

    .line 46
    .line 47
    const-string p2, "\u0001\u0000"

    .line 48
    .line 49
    invoke-direct {p1, p0, p2, v1}, Laq3;-><init>(Ltm3;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-object p1

    .line 53
    :cond_5
    iget-byte p0, p0, Lcm3;->zze:B

    .line 54
    .line 55
    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0
.end method
