.class public final enum Lgl;
.super Ljava/lang/Enum;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final Companion:Lfl;

.field public static final enum a:Lgl;

.field public static final enum b:Lgl;

.field public static final enum c:Lgl;

.field public static final synthetic d:[Lgl;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lgl;

    .line 2
    .line 3
    const-string v1, "HORIZONTAL"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lgl;->a:Lgl;

    .line 10
    .line 11
    new-instance v1, Lgl;

    .line 12
    .line 13
    const-string v2, "VERTICAL"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lgl;->b:Lgl;

    .line 20
    .line 21
    new-instance v2, Lgl;

    .line 22
    .line 23
    const-string v3, "DEFAULT"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v2, Lgl;->c:Lgl;

    .line 30
    .line 31
    filled-new-array {v0, v1, v2}, [Lgl;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lgl;->d:[Lgl;

    .line 36
    .line 37
    new-instance v0, Lle0;

    .line 38
    .line 39
    new-instance v0, Lfl;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lgl;->Companion:Lfl;

    .line 45
    .line 46
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lgl;
    .locals 1

    .line 1
    const-class v0, Lgl;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lgl;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lgl;
    .locals 1

    .line 1
    sget-object v0, Lgl;->d:[Lgl;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lgl;

    .line 8
    .line 9
    return-object v0
.end method
