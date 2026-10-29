.class public abstract Lcom/quago/mobile/sdk/k0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final a:Ljava/util/Locale;

.field public static b:I

.field public static c:Lcom/quago/mobile/sdk/utils/IQuagoLog;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 2
    .line 3
    sput-object v0, Lcom/quago/mobile/sdk/k0;->a:Ljava/util/Locale;

    .line 4
    .line 5
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->VERBOSE:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 6
    .line 7
    iget v0, v0, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->priority:I

    .line 8
    .line 9
    sput v0, Lcom/quago/mobile/sdk/k0;->b:I

    .line 10
    .line 11
    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/quago/mobile/sdk/j0;
    .locals 1

    .line 14
    new-instance v0, Lcom/quago/mobile/sdk/j0;

    invoke-direct {v0, p0}, Lcom/quago/mobile/sdk/j0;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static a(Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;)V
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    sget-object p0, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->INFO:Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;

    .line 4
    .line 5
    invoke-static {p0}, Lcom/quago/mobile/sdk/k0;->a(Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget p0, p0, Lcom/quago/mobile/sdk/QuagoSettings$LogLevel;->priority:I

    .line 10
    .line 11
    sput p0, Lcom/quago/mobile/sdk/k0;->b:I

    .line 12
    .line 13
    return-void
.end method

.method public static a(I)Z
    .locals 1

    .line 15
    sget v0, Lcom/quago/mobile/sdk/k0;->b:I

    if-lt p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
