.class public final Lxa0;
.super Lin2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic e:Lza0;


# direct methods
.method public constructor <init>(Lza0;Lcom/google/android/material/textfield/TextInputLayout;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxa0;->e:Lza0;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lin2;-><init>(Lcom/google/android/material/textfield/TextInputLayout;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final d(Landroid/view/View;Lf1;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lin2;->d(Landroid/view/View;Lf1;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lxa0;->e:Lza0;

    .line 5
    .line 6
    iget-object p0, p0, Lde0;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p0}, Lza0;->h(Landroid/widget/EditText;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    const-class p0, Landroid/widget/Spinner;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p2, p0}, Lf1;->i(Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 28
    .line 29
    const/16 p1, 0x1a

    .line 30
    .line 31
    if-lt p0, p1, :cond_1

    .line 32
    .line 33
    iget-object p0, p2, Lf1;->a:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 34
    .line 35
    invoke-static {p0}, Lp0;->y(Landroid/view/accessibility/AccessibilityNodeInfo;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 p0, 0x4

    .line 41
    invoke-virtual {p2, p0}, Lf1;->e(I)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    :goto_0
    if-eqz p0, :cond_2

    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    invoke-virtual {p2, p0}, Lf1;->k(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :cond_2
    return-void
.end method

.method public final e(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, Lt0;->e(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lxa0;->e:Lza0;

    .line 5
    .line 6
    iget-object p1, p0, Lde0;->a:Lcom/google/android/material/textfield/TextInputLayout;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    instance-of v1, v0, Landroid/widget/AutoCompleteTextView;

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    check-cast v0, Landroid/widget/AutoCompleteTextView;

    .line 17
    .line 18
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    const/4 v1, 0x1

    .line 23
    if-ne p2, v1, :cond_0

    .line 24
    .line 25
    iget-object p2, p0, Lza0;->q:Landroid/view/accessibility/AccessibilityManager;

    .line 26
    .line 27
    invoke-virtual {p2}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_0

    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {p1}, Lza0;->h(Landroid/widget/EditText;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-nez p1, :cond_0

    .line 42
    .line 43
    invoke-static {p0, v0}, Lza0;->d(Lza0;Landroid/widget/AutoCompleteTextView;)V

    .line 44
    .line 45
    .line 46
    iput-boolean v1, p0, Lza0;->l:Z

    .line 47
    .line 48
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 49
    .line 50
    .line 51
    move-result-wide p1

    .line 52
    iput-wide p1, p0, Lza0;->n:J

    .line 53
    .line 54
    :cond_0
    return-void

    .line 55
    :cond_1
    const-string p0, "EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used."

    .line 56
    .line 57
    invoke-static {p0}, Lf42;->s(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-void
.end method
