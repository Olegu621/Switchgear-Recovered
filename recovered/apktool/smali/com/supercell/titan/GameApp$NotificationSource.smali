.class public final enum Lcom/supercell/titan/GameApp$NotificationSource;
.super Ljava/lang/Enum;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/supercell/titan/GameApp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "NotificationSource"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/supercell/titan/GameApp$NotificationSource;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum CHRONOS:Lcom/supercell/titan/GameApp$NotificationSource;

.field public static final enum LOCAL:Lcom/supercell/titan/GameApp$NotificationSource;

.field public static final enum NOT_SET:Lcom/supercell/titan/GameApp$NotificationSource;

.field public static final enum SERVER:Lcom/supercell/titan/GameApp$NotificationSource;

.field public static final enum SOCIAL:Lcom/supercell/titan/GameApp$NotificationSource;

.field public static final synthetic b:[Lcom/supercell/titan/GameApp$NotificationSource;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lcom/supercell/titan/GameApp$NotificationSource;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, -0x1

    .line 5
    const-string v3, "NOT_SET"

    .line 6
    .line 7
    invoke-direct {v0, v3, v1, v2}, Lcom/supercell/titan/GameApp$NotificationSource;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/supercell/titan/GameApp$NotificationSource;->NOT_SET:Lcom/supercell/titan/GameApp$NotificationSource;

    .line 11
    .line 12
    new-instance v1, Lcom/supercell/titan/GameApp$NotificationSource;

    .line 13
    .line 14
    const-string v2, "CHRONOS"

    .line 15
    .line 16
    const/4 v3, 0x1

    .line 17
    invoke-direct {v1, v2, v3, v3}, Lcom/supercell/titan/GameApp$NotificationSource;-><init>(Ljava/lang/String;II)V

    .line 18
    .line 19
    .line 20
    sput-object v1, Lcom/supercell/titan/GameApp$NotificationSource;->CHRONOS:Lcom/supercell/titan/GameApp$NotificationSource;

    .line 21
    .line 22
    new-instance v2, Lcom/supercell/titan/GameApp$NotificationSource;

    .line 23
    .line 24
    const-string v3, "SERVER"

    .line 25
    .line 26
    const/4 v4, 0x2

    .line 27
    invoke-direct {v2, v3, v4, v4}, Lcom/supercell/titan/GameApp$NotificationSource;-><init>(Ljava/lang/String;II)V

    .line 28
    .line 29
    .line 30
    sput-object v2, Lcom/supercell/titan/GameApp$NotificationSource;->SERVER:Lcom/supercell/titan/GameApp$NotificationSource;

    .line 31
    .line 32
    new-instance v3, Lcom/supercell/titan/GameApp$NotificationSource;

    .line 33
    .line 34
    const-string v4, "LOCAL"

    .line 35
    .line 36
    const/4 v5, 0x3

    .line 37
    invoke-direct {v3, v4, v5, v5}, Lcom/supercell/titan/GameApp$NotificationSource;-><init>(Ljava/lang/String;II)V

    .line 38
    .line 39
    .line 40
    sput-object v3, Lcom/supercell/titan/GameApp$NotificationSource;->LOCAL:Lcom/supercell/titan/GameApp$NotificationSource;

    .line 41
    .line 42
    new-instance v4, Lcom/supercell/titan/GameApp$NotificationSource;

    .line 43
    .line 44
    const-string v5, "SOCIAL"

    .line 45
    .line 46
    const/4 v6, 0x4

    .line 47
    invoke-direct {v4, v5, v6, v6}, Lcom/supercell/titan/GameApp$NotificationSource;-><init>(Ljava/lang/String;II)V

    .line 48
    .line 49
    .line 50
    sput-object v4, Lcom/supercell/titan/GameApp$NotificationSource;->SOCIAL:Lcom/supercell/titan/GameApp$NotificationSource;

    .line 51
    .line 52
    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/supercell/titan/GameApp$NotificationSource;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    sput-object v0, Lcom/supercell/titan/GameApp$NotificationSource;->b:[Lcom/supercell/titan/GameApp$NotificationSource;

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
    iput p3, p0, Lcom/supercell/titan/GameApp$NotificationSource;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static fromCode(I)Lcom/supercell/titan/GameApp$NotificationSource;
    .locals 1

    .line 1
    const/4 v0, -0x1

    .line 2
    if-eq p0, v0, :cond_4

    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    if-eq p0, v0, :cond_3

    .line 6
    .line 7
    const/4 v0, 0x2

    .line 8
    if-eq p0, v0, :cond_2

    .line 9
    .line 10
    const/4 v0, 0x3

    .line 11
    if-eq p0, v0, :cond_1

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    if-eq p0, v0, :cond_0

    .line 15
    .line 16
    sget-object p0, Lcom/supercell/titan/GameApp$NotificationSource;->NOT_SET:Lcom/supercell/titan/GameApp$NotificationSource;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_0
    sget-object p0, Lcom/supercell/titan/GameApp$NotificationSource;->SOCIAL:Lcom/supercell/titan/GameApp$NotificationSource;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_1
    sget-object p0, Lcom/supercell/titan/GameApp$NotificationSource;->LOCAL:Lcom/supercell/titan/GameApp$NotificationSource;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_2
    sget-object p0, Lcom/supercell/titan/GameApp$NotificationSource;->SERVER:Lcom/supercell/titan/GameApp$NotificationSource;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_3
    sget-object p0, Lcom/supercell/titan/GameApp$NotificationSource;->CHRONOS:Lcom/supercell/titan/GameApp$NotificationSource;

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_4
    sget-object p0, Lcom/supercell/titan/GameApp$NotificationSource;->NOT_SET:Lcom/supercell/titan/GameApp$NotificationSource;

    .line 32
    .line 33
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/supercell/titan/GameApp$NotificationSource;
    .locals 1

    .line 1
    const-class v0, Lcom/supercell/titan/GameApp$NotificationSource;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/supercell/titan/GameApp$NotificationSource;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/supercell/titan/GameApp$NotificationSource;
    .locals 1

    .line 1
    sget-object v0, Lcom/supercell/titan/GameApp$NotificationSource;->b:[Lcom/supercell/titan/GameApp$NotificationSource;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/supercell/titan/GameApp$NotificationSource;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/supercell/titan/GameApp$NotificationSource;

    .line 8
    .line 9
    return-object v0
.end method
