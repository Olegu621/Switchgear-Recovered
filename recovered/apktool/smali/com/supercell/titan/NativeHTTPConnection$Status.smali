.class public final enum Lcom/supercell/titan/NativeHTTPConnection$Status;
.super Ljava/lang/Enum;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/supercell/titan/NativeHTTPConnection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Status"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/supercell/titan/NativeHTTPConnection$Status;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum ACTIVE:Lcom/supercell/titan/NativeHTTPConnection$Status;

.field public static final enum FAILED:Lcom/supercell/titan/NativeHTTPConnection$Status;

.field public static final enum IDLE:Lcom/supercell/titan/NativeHTTPConnection$Status;

.field public static final enum OK:Lcom/supercell/titan/NativeHTTPConnection$Status;

.field public static final enum UNDEFINED:Lcom/supercell/titan/NativeHTTPConnection$Status;

.field public static final synthetic b:[Lcom/supercell/titan/NativeHTTPConnection$Status;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lcom/supercell/titan/NativeHTTPConnection$Status;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const-string v2, "UNDEFINED"

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-direct {v0, v2, v3, v1}, Lcom/supercell/titan/NativeHTTPConnection$Status;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/supercell/titan/NativeHTTPConnection$Status;->UNDEFINED:Lcom/supercell/titan/NativeHTTPConnection$Status;

    .line 11
    .line 12
    new-instance v1, Lcom/supercell/titan/NativeHTTPConnection$Status;

    .line 13
    .line 14
    const-string v2, "IDLE"

    .line 15
    .line 16
    const/4 v4, 0x1

    .line 17
    invoke-direct {v1, v2, v4, v3}, Lcom/supercell/titan/NativeHTTPConnection$Status;-><init>(Ljava/lang/String;II)V

    .line 18
    .line 19
    .line 20
    sput-object v1, Lcom/supercell/titan/NativeHTTPConnection$Status;->IDLE:Lcom/supercell/titan/NativeHTTPConnection$Status;

    .line 21
    .line 22
    new-instance v2, Lcom/supercell/titan/NativeHTTPConnection$Status;

    .line 23
    .line 24
    const-string v3, "ACTIVE"

    .line 25
    .line 26
    const/4 v5, 0x2

    .line 27
    invoke-direct {v2, v3, v5, v4}, Lcom/supercell/titan/NativeHTTPConnection$Status;-><init>(Ljava/lang/String;II)V

    .line 28
    .line 29
    .line 30
    sput-object v2, Lcom/supercell/titan/NativeHTTPConnection$Status;->ACTIVE:Lcom/supercell/titan/NativeHTTPConnection$Status;

    .line 31
    .line 32
    new-instance v3, Lcom/supercell/titan/NativeHTTPConnection$Status;

    .line 33
    .line 34
    const-string v4, "OK"

    .line 35
    .line 36
    const/4 v6, 0x3

    .line 37
    invoke-direct {v3, v4, v6, v5}, Lcom/supercell/titan/NativeHTTPConnection$Status;-><init>(Ljava/lang/String;II)V

    .line 38
    .line 39
    .line 40
    sput-object v3, Lcom/supercell/titan/NativeHTTPConnection$Status;->OK:Lcom/supercell/titan/NativeHTTPConnection$Status;

    .line 41
    .line 42
    new-instance v4, Lcom/supercell/titan/NativeHTTPConnection$Status;

    .line 43
    .line 44
    const-string v5, "FAILED"

    .line 45
    .line 46
    const/4 v7, 0x4

    .line 47
    invoke-direct {v4, v5, v7, v6}, Lcom/supercell/titan/NativeHTTPConnection$Status;-><init>(Ljava/lang/String;II)V

    .line 48
    .line 49
    .line 50
    sput-object v4, Lcom/supercell/titan/NativeHTTPConnection$Status;->FAILED:Lcom/supercell/titan/NativeHTTPConnection$Status;

    .line 51
    .line 52
    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/supercell/titan/NativeHTTPConnection$Status;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    sput-object v0, Lcom/supercell/titan/NativeHTTPConnection$Status;->b:[Lcom/supercell/titan/NativeHTTPConnection$Status;

    .line 57
    .line 58
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcom/supercell/titan/NativeHTTPConnection$Status;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/supercell/titan/NativeHTTPConnection$Status;
    .locals 1

    .line 1
    const-class v0, Lcom/supercell/titan/NativeHTTPConnection$Status;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/supercell/titan/NativeHTTPConnection$Status;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/supercell/titan/NativeHTTPConnection$Status;
    .locals 1

    .line 1
    sget-object v0, Lcom/supercell/titan/NativeHTTPConnection$Status;->b:[Lcom/supercell/titan/NativeHTTPConnection$Status;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/supercell/titan/NativeHTTPConnection$Status;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/supercell/titan/NativeHTTPConnection$Status;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public getCode()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/supercell/titan/NativeHTTPConnection$Status;->a:I

    .line 2
    .line 3
    return p0
.end method
