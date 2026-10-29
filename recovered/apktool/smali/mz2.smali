.class public final enum Lmz2;
.super Ljava/lang/Enum;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final Companion:Llz2;

.field public static final enum a:Lmz2;

.field public static final enum b:Lmz2;

.field public static final synthetic c:[Lmz2;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lmz2;

    .line 2
    .line 3
    const-string v1, "EXPLICIT"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lmz2;->a:Lmz2;

    .line 10
    .line 11
    new-instance v1, Lmz2;

    .line 12
    .line 13
    const-string v2, "IMPLICIT"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lmz2;->b:Lmz2;

    .line 20
    .line 21
    filled-new-array {v0, v1}, [Lmz2;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lmz2;->c:[Lmz2;

    .line 26
    .line 27
    new-instance v0, Lle0;

    .line 28
    .line 29
    new-instance v0, Llz2;

    .line 30
    .line 31
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lmz2;->Companion:Llz2;

    .line 35
    .line 36
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lmz2;
    .locals 1

    .line 1
    const-class v0, Lmz2;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lmz2;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lmz2;
    .locals 1

    .line 1
    sget-object v0, Lmz2;->c:[Lmz2;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lmz2;

    .line 8
    .line 9
    return-object v0
.end method
