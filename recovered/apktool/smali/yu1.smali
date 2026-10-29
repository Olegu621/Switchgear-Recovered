.class public final enum Lyu1;
.super Ljava/lang/Enum;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final Companion:Lxu1;

.field public static final enum b:Lyu1;

.field public static final synthetic c:[Lyu1;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lyu1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "javascript:UC_UI.acceptAllConsents().then(UC_UI.closeCMP);"

    .line 5
    .line 6
    const-string v3, "ACCEPT_ALL_LINK"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lyu1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lyu1;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    const-string v3, "javascript:UC_UI.denyAllConsents().then(UC_UI.closeCMP);"

    .line 15
    .line 16
    const-string v4, "DENY_ALL_LINK"

    .line 17
    .line 18
    invoke-direct {v1, v4, v2, v3}, Lyu1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Lyu1;->b:Lyu1;

    .line 22
    .line 23
    new-instance v2, Lyu1;

    .line 24
    .line 25
    const/4 v3, 0x2

    .line 26
    const-string v4, "javascript:UC_UI.showSecondLayer()"

    .line 27
    .line 28
    const-string v5, "SHOW_SECOND_LAYER"

    .line 29
    .line 30
    invoke-direct {v2, v5, v3, v4}, Lyu1;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    filled-new-array {v0, v1, v2}, [Lyu1;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sput-object v0, Lyu1;->c:[Lyu1;

    .line 38
    .line 39
    new-instance v0, Lle0;

    .line 40
    .line 41
    new-instance v0, Lxu1;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    sput-object v0, Lyu1;->Companion:Lxu1;

    .line 47
    .line 48
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lyu1;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lyu1;
    .locals 1

    .line 1
    const-class v0, Lyu1;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lyu1;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lyu1;
    .locals 1

    .line 1
    sget-object v0, Lyu1;->c:[Lyu1;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lyu1;

    .line 8
    .line 9
    return-object v0
.end method
