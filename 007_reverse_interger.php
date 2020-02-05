class Solution {

    /**
     * @param Integer $x
     * @return Integer
     */
    function reverse($x) {
        $xStr = strval($x);
        $xStrSwap = "";
        for ($i = strlen($xStr) - 1; $i >= 0; $i--){
            $xStrSwap .= $xStr[$i];
        }
        $xFinal = 0;
        if ($x < 0) {
            $xFinal -= intval($xStrSwap);
        } else {
            $xFinal += intval($xStrSwap);
        }
        if ($xFinal < -2147483648 || $xFinal > 2147483647) {
            return 0;
        } else {
            return $xFinal;
        }
	}
}
