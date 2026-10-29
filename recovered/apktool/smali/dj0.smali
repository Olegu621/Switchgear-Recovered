.class public final enum Ldj0;
.super Ljava/lang/Enum;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final enum a:Ldj0;

.field public static final enum b:Ldj0;

.field public static final synthetic c:[Ldj0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ldj0;

    .line 2
    .line 3
    const-string v1, "LINK"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Ldj0;->a:Ldj0;

    .line 10
    .line 11
    new-instance v1, Ldj0;

    .line 12
    .line 13
    const-string v2, "ICON"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Ldj0;->b:Ldj0;

    .line 20
    .line 21
    filled-new-array {v0, v1}, [Ldj0;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Ldj0;->c:[Ldj0;

    .line 26
    .line 27
    new-instance v0, Lle0;

    .line 28
    .line 29
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ldj0;
    .locals 1

    .line 1
    const-class v0, Ldj0;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ldj0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Ldj0;
    .locals 1

    .line 1
    sget-object v0, Ldj0;->c:[Ldj0;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Ldj0;

    .line 8
    .line 9
    return-object v0
.end method
