.class public final enum Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;
.super Ljava/lang/Enum;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/quago/mobile/sdk/QuagoSettings;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "QuagoFlavor"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;

.field public static final enum AUTHENTIC:Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;

.field public static final enum DEVELOPMENT:Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;

.field private static final ENUMS_MAP:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;",
            ">;"
        }
    .end annotation
.end field

.field public static final enum PRODUCTION:Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;

.field public static final enum UNAUTHENTIC:Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;


# instance fields
.field public final value:I


# direct methods
.method private static synthetic $values()[Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;
    .locals 4

    .line 1
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;->AUTHENTIC:Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;

    .line 2
    .line 3
    sget-object v1, Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;->UNAUTHENTIC:Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;

    .line 4
    .line 5
    sget-object v2, Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;->PRODUCTION:Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;

    .line 6
    .line 7
    sget-object v3, Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;->DEVELOPMENT:Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, v3}, [Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;

    .line 2
    .line 3
    const-string v1, "AUTHENTIC"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;->AUTHENTIC:Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;

    .line 10
    .line 11
    new-instance v0, Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;

    .line 12
    .line 13
    const-string v1, "UNAUTHENTIC"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v0, v1, v3, v3}, Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;->UNAUTHENTIC:Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;

    .line 20
    .line 21
    new-instance v0, Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;

    .line 22
    .line 23
    const-string v1, "PRODUCTION"

    .line 24
    .line 25
    const/4 v3, 0x2

    .line 26
    invoke-direct {v0, v1, v3, v3}, Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;->PRODUCTION:Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;

    .line 30
    .line 31
    new-instance v0, Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;

    .line 32
    .line 33
    const-string v1, "DEVELOPMENT"

    .line 34
    .line 35
    const/4 v3, 0x3

    .line 36
    invoke-direct {v0, v1, v3, v3}, Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;-><init>(Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;->DEVELOPMENT:Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;

    .line 40
    .line 41
    invoke-static {}, Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;->$values()[Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;->$VALUES:[Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;

    .line 46
    .line 47
    new-instance v0, Ljava/util/HashMap;

    .line 48
    .line 49
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-static {}, Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;->values()[Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    array-length v3, v1

    .line 57
    :goto_0
    if-ge v2, v3, :cond_0

    .line 58
    .line 59
    aget-object v4, v1, v2

    .line 60
    .line 61
    iget v5, v4, Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;->value:I

    .line 62
    .line 63
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    add-int/lit8 v2, v2, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    sput-object v0, Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;->ENUMS_MAP:Ljava/util/Map;

    .line 78
    .line 79
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;->value:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(I)Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;
    .locals 1

    .line 1
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;->ENUMS_MAP:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;

    .line 12
    .line 13
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;
    .locals 1

    .line 14
    const-class v0, Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;

    return-object p0
.end method

.method public static values()[Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;
    .locals 1

    .line 1
    sget-object v0, Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;->$VALUES:[Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/quago/mobile/sdk/QuagoSettings$QuagoFlavor;

    .line 8
    .line 9
    return-object v0
.end method
