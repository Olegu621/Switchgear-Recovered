.class public final Lcom/quago/mobile/sdk/c1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final d:Ljava/lang/String;


# instance fields
.field public final a:[C

.field public final b:[C

.field public final c:Ljava/security/SecureRandom;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 2
    .line 3
    const-string v1, "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    .line 4
    .line 5
    invoke-virtual {v1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v2, "0123456789"

    .line 10
    .line 11
    invoke-static {v1, v0, v2}, Lfm0;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lcom/quago/mobile/sdk/c1;->d:Ljava/lang/String;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 33
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    sget-object v1, Lcom/quago/mobile/sdk/c1;->d:Ljava/lang/String;

    invoke-direct {p0, v0, v1}, Lcom/quago/mobile/sdk/c1;-><init>(Ljava/security/SecureRandom;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/security/SecureRandom;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x2

    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/String;->toCharArray()[C

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    iput-object p2, p0, Lcom/quago/mobile/sdk/c1;->a:[C

    .line 16
    .line 17
    const/16 p2, 0x24

    .line 18
    .line 19
    new-array p2, p2, [C

    .line 20
    .line 21
    iput-object p2, p0, Lcom/quago/mobile/sdk/c1;->b:[C

    .line 22
    .line 23
    iput-object p1, p0, Lcom/quago/mobile/sdk/c1;->c:Ljava/security/SecureRandom;

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    const-string p0, "allowed characters must include at least 2 characters"

    .line 27
    .line 28
    invoke-static {p0}, Ln4;->j(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const/4 p0, 0x0

    .line 32
    throw p0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/quago/mobile/sdk/c1;->b:[C

    .line 3
    .line 4
    array-length v2, v1

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    add-int/lit8 v2, v0, 0x1

    .line 8
    .line 9
    iget-object v3, p0, Lcom/quago/mobile/sdk/c1;->a:[C

    .line 10
    .line 11
    iget-object v4, p0, Lcom/quago/mobile/sdk/c1;->c:Ljava/security/SecureRandom;

    .line 12
    .line 13
    array-length v5, v3

    .line 14
    invoke-virtual {v4, v5}, Ljava/util/Random;->nextInt(I)I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    aget-char v3, v3, v4

    .line 19
    .line 20
    aput-char v3, v1, v0

    .line 21
    .line 22
    move v0, v2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p0, Ljava/lang/String;

    .line 25
    .line 26
    invoke-direct {p0, v1}, Ljava/lang/String;-><init>([C)V

    .line 27
    .line 28
    .line 29
    return-object p0
.end method
